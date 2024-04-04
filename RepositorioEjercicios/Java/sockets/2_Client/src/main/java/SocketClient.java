
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class SocketClient implements Runnable{
    private String host;
    private Integer port;
    private Socket socket;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Boolean isConnected;
    private OnServerResponse listener;

    public SocketClient(String host, Integer port) {
        this.host = host;
        this.port = port;
        this.isConnected = false;
    }
    public void connect(){
        try {
            socket = new Socket(this.host, this.port);
            output = new ObjectOutputStream(socket.getOutputStream());
            input = new ObjectInputStream(socket.getInputStream());
            this.isConnected = true;
            Thread thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void DisConnect(){
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void onReponse(OnServerResponse listener){
        this.listener = listener;
    }
    public void emmit(ClientData send){
        try {
            output.writeObject(send);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (this.isConnected) {            
            try {
                ClientData response = (ClientData)input.readObject();
                this.listener.onReponse(response);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
    
}
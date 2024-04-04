
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class ServerClient extends Thread{
    private Socket client;
    private Server server;
    private ObjectOutputStream output;
    private ObjectInputStream input;
    private Boolean isConnected;
    private eventForJoinRoom listener;
    private String room;

    public ServerClient(Socket socket, Server server) {
        this.client = socket;//client;
        this.server = server;
        this.isConnected = true;
        this.room = "";
        
        try {
            output = new ObjectOutputStream(this.client.getOutputStream());
            input = new ObjectInputStream(this.client.getInputStream());
            System.out.println("Client " + this.client.getLocalAddress() + " port " + this.client.getLocalPort());
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    private void close() {
        try {
            this.client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addEventListener(eventForJoinRoom listener){
        this.listener = listener;
    }
    public void emmit(ClientData sendData) {
        try {
            output.writeObject(sendData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run(){
            while (this.isConnected) {            
                try {
                    ClientData data = (ClientData) input.readObject();
                    if(data.getMsg().equals("init session")){
                        ClientData response = new ClientData("Server ", "Bienvenido al chat " + data.getName());
                        output.writeObject(response);
                    }else if(data.getMsg().equals(":quit")){
                        this.isConnected = false; 
                    }else if(data.getMsg().contains(":join")){
                        String[] command = data.getMsg().split(" ");
                        if(command.length == 2){
                            this.room = command[1];
                            this.listener.join(this, command[1]);
                        }
                    }else if(this.room == ""){
                        ClientData response = new ClientData("Server", data.getName() + " No estas Conectado a una sala usa el Comando :join <SALA> para unirte a una");
                        output.writeObject(response);
                    }else{
                        this.server.emmitAllMenssages(this.room, data);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
        }
        close();
     }  
}
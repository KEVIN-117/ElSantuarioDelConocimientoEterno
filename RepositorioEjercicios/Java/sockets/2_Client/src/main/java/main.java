
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Escriva su nombre ");
        String nombre = read.nextLine();
        SocketClient socketClient = new SocketClient("127.0.0.1", 3000);
        socketClient.connect();
        socketClient.onReponse((response) -> { 
            System.out.println(response.getName() + "<ENVIO>_/> " + response.getMsg() + " _/> " + response.getDate());
        });
        ClientData initPackage = new ClientData(nombre, "init session");
        socketClient.emmit(initPackage);
        
        while (true) {            
            String msn = read.nextLine();
            ClientData packageData = new ClientData(nombre, msn);
            socketClient.emmit(packageData);
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("_/> ");
        }
    }
}
/*//Inicio Clase ClientData
//Fin Clase ClientData
class ClientData implements Serializable{
    private String name;
    private String msg;
    private Date date;

    public ClientData(String name, String msg) {
        this.name = name;
        this.msg = msg;
        this.date = Calendar.getInstance().getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
//Fin Clase ClientData

//Inicio Interface  OnServerResponse
interface OnServerResponse {
    public void onReponse(ClientData response);
}
//Fin Interface  OnServerResponse

//Inicio Clase SocketClient
class SocketClient implements Runnable{
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
//Fin Clase SocketClient*/
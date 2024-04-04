

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Server server = new Server(3000);
        server.start();
        Scanner read = new Scanner(System.in);
        while(true){
            if(read.nextLine().equals(":stop")){
                server.stop();
                break;
            }
        } 
    }
}

/*//Inicio Clase ClientData
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

//Inicio Clase Server
class Server implements Runnable{
    private Integer port;
    private ServerSocket server;
    private Boolean isRunning;
    private Thread thread;
    private HashMap<String, ArrayList<ServerClient>> roomlist;
    
    public Server(Integer port){
        this.port = port;
        this.isRunning = false;
        roomlist = new HashMap<String, ArrayList<ServerClient>>();
    }
    public void start(){
        try {
            server = new ServerSocket(this.port);
            System.out.println("Server is Running " + this.port);
            this.isRunning = true;
            thread = new Thread(this);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void emmitAllMenssages(String roomName, ClientData sendData) {
        ArrayList<ServerClient> room = roomlist.get(roomName);
        for (int i = 0; i < room.size(); i++) {
            room.get(i).emmit(sendData);
        }
    }
    @Override
    public void run() {
        while(this.isRunning){
            try {
                Socket clientSockets = this.server.accept();
                ServerClient client = new ServerClient(clientSockets, this);
                client.start();
                client.addEventListener((ServerClient client1Socket, String roomName) ->{
                    ArrayList<ServerClient> room = roomlist.get(roomName);
                    if(room == null){
                        room = new ArrayList<ServerClient>();
                    }
                    room.add(client1Socket);
                    roomlist.put(roomName, room);
                });
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void stop(){
        try {
            this.isRunning = false;
            thread.stop();
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Fin clase server

//Inicio Clase ServerClient
class ServerClient extends Thread{
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
//Fin Clase ServerClient

//Inicio Interface eventForJoinRoom
interface eventForJoinRoom {
    public void join(ServerClient client, String room);
}
//Fin Interface eventForJoinRoom*/
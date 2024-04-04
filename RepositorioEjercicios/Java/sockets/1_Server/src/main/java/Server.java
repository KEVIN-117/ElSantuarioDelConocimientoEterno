
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;


public class Server implements Runnable{
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
}// Fin clase server

package org.example.N_13_Uers_Data;

import java.io.*;

public class LikedList implements Serializable {
    Node header = null;
    File file = new File(".\\src\\N_13_Uers_Data");
    public void addData(UserData item){
        if (header == null){
            header = new Node(item);
        }else {
            Node temp = new Node(item);
            temp.linked = header;
            header = temp;
        }
    }
    public void showData(){
        while (header != null){
            System.out.println(header.data);
            header = header.linked;
        }
    }

    public  void saveDataFile()throws  Exception{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(header);
        fileOutputStream.close();
        objectOutputStream.close();
    }
    public void loadData()throws Exception{
        if (file.exists()){
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            header = (Node) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        }else{
            saveDataFile();
        }
    }
}

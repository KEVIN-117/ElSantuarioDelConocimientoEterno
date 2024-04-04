package org.example.N_11_Linked_Lists.Class_3;

import java.io.*;

public class LinkedList implements Serializable {
    Node header = null;
    File file = new File(".\\src\\N_11_Linked_Lists\\Class_3\\DataList.dat");
    public void addData(int item){
        if(header == null){
            header = new Node(item);
        }else{
            Node temp = new Node(item);
            temp.linked = header;
            header = temp;
        }
    }
    public void showData(){
        Node aux = header;
        while (aux != null){
            System.out.print(aux.data + " ");
            aux = aux.linked;
        }
    }

    public void saveDataFile() throws  Exception{
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(header);
        fileOutputStream.close();
        objectOutputStream.close();
    }
    public void loadData()throws Exception{
        if(file.exists()){
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

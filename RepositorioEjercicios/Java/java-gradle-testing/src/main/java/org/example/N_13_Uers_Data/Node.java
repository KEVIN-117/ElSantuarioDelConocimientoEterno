package org.example.N_13_Uers_Data;


import java.io.Serializable;

public class Node implements Serializable {
    Node linked;
    UserData data;
    public Node(UserData data){
        this.data = data;
        this.linked = null;
    }
}

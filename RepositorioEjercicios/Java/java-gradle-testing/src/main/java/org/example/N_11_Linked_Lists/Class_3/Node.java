package org.example.N_11_Linked_Lists.Class_3;

import java.io.Serializable;

public class Node implements Serializable {
     Node linked;
     int data;
    public Node(int Data){
        this.data = Data;
        this.linked = null;
    }
}

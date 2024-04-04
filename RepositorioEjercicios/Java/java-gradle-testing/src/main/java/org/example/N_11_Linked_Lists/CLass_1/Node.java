package org.example.N_11_Linked_Lists.CLass_1;

public class Node {
    Node linked;
    int Data;
    String DataString;
    Node(int data){
        this.Data = data;
        this.linked = null;
    }
    Node(String data){
        this.DataString = data;
        this.linked = null;
    }
}

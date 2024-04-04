package org.example.HomeWork_13.Example_3;

import org.example.HomeWork_13.Node;

public class LinkedList {
    Node header = null;
    public void addData(int item){
        if (header == null){
            header = new Node(item);
        }else {
            Node temp = new Node(item);
            temp.linked = header;
            header = temp;
        }
    }

    public  void showData(){
        Node aux = header;
        while (aux != null){
            System.out.print(aux.Data + " ");
            aux = aux.linked;
        }
    }
    public int counterPairNumber(){
        Node aux = header;
        int counter = 0;
        while (aux != null){
            if (aux.Data%2 == 0){
                counter++;
            }
            aux = aux.linked;
        }
        return counter;
    }
    public double averageData(){
        Node aux = header;
        double addition = 0;
        double counter = 0;
        while (aux != null){
            addition += aux.Data;
            counter++;
            aux = aux.linked;
        }
        double average = addition/counter;
        return average;
    }
    public int biggerNumber(){
        Node aux = header;
        int bigger = 0;
        while (aux != null){
            if (aux.Data > bigger){
                bigger = aux.Data;
            }
            aux = aux.linked;
        }
        return bigger;
    }
    public void printUniqueNumber(){
        Node unique = header;
        while (unique != null){
            Node aux = header;
            int counter = 0;
            while (aux != null){
                if (aux.Data == unique.Data){
                    counter++;
                }
                aux = aux.linked;
            }
            if (counter == 1){
                System.out.print(unique.Data + " ");
            }
            unique = unique.linked;
        }
    }
}

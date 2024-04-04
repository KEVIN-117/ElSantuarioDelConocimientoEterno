package org.example.HomeWork_13;

import java.util.Scanner;

public class Example_1 {
    static Node header;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        header = null;
        for (int i = 0; i < N; i++) {
            add(input.nextInt());
        }
        Node aux = header;
        while (aux != null){
            System.out.print(aux.Data + " ");
            aux = aux.linked;
        }
    }
    static void add(int item){
        if (header == null){
            header = new Node(item);
        }else{
            Node temp = new Node(item);
            if (item < header.Data){
                temp.linked = header;
                header = temp;
            }else {
                Node p = header;
                while (p.linked != null)
                    p = p.linked;
                p.linked = temp;
            }
        }
    }
}

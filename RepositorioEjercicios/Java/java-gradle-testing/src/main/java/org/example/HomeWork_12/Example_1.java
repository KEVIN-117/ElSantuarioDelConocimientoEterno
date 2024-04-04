package org.example.HomeWork_12;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Node header = null;
        for (int i = 0; i < N; i++) {
            if (header == null){
                header = new Node(input.nextInt());
            }
            else {
                Node temp = new Node(input.nextInt());
                if (temp.Data%2 != 0){
                    temp.linked = header.linked;
                    header.linked = temp;
                }else {
                    temp.linked = header;
                    header = temp;
                }
            }
        }
        Node aux = header;
        while (aux != null){
            System.out.print(aux.Data + " ");
            aux = aux.linked;
        }
    }
}

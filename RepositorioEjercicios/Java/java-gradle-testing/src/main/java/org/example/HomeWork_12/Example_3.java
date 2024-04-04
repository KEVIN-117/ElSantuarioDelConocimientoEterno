package org.example.HomeWork_12;

import java.util.Scanner;

/*  Realice un programa que permita insertar N números en una lista enlazada, posteriormente muestre
    el números más grande de la lista
    Ejemplo:
    Entrada             Salida
    5                   8
    6 8 3 2 6
 */
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Node header = null;
        for (int i = 0; i < N; i++) {
            if (header == null){
                header = new Node(input.nextInt());
            }else{
                Node temp = new Node(input.nextInt());
                temp.linked = header;
                header = temp;
            }
        }
        Node auxiliary = header;
        int bigNumber = 0;
        while (auxiliary != null){
            int saveNumber = auxiliary.Data;
            if (saveNumber > bigNumber){
                bigNumber = saveNumber;
            }
            auxiliary = auxiliary.linked;
        }
        System.out.print(bigNumber);
    }
}
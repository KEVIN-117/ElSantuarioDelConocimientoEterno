package org.example.HomeWork_12;

import java.util.Scanner;
import java.util.Stack;

/*
    Realice un programa que permita insertar N números en una lista enlazada, posteriormente
    Muestre primero los números pares y luego los números impares
    Ejemplo:
    Entrada                     Salida
    6                           4 8 2 4 7 3
    7 4 8 3 2 4
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stackEvenNumbers = new Stack<>();
        Stack<Integer> stackOddNumbers = new Stack<>();
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
        while (auxiliary != null){
            if (auxiliary.Data%2 == 0){
                stackEvenNumbers.push(auxiliary.Data);
            }else {
                stackOddNumbers.push(auxiliary.Data);
            }
            auxiliary = auxiliary.linked;
        }

        while (!stackEvenNumbers.isEmpty())
            System.out.print(stackEvenNumbers.pop() + " ");
        while (!stackOddNumbers.isEmpty())
            System.out.print(stackOddNumbers.pop() + " ");
    }
}

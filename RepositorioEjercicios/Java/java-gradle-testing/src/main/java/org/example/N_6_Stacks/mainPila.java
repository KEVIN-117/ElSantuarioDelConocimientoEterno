package org.example.N_6_Stacks;

import java.util.Scanner;

public class mainPila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Pila p = new Pila(0, N);
        for (int i = 0; i < N; i++) {
            p.push(input.nextInt());
        }
        while (!p.isEmpty()) {
            System.out.print(p.pop() + " ");
        }
    }
}

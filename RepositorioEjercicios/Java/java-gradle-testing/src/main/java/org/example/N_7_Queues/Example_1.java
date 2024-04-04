package org.example.N_7_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Queue<Integer> c = new LinkedList<Integer>();
        int N = x.nextInt();
        for (int i = 0; i < N; i++) {
            c.add(x.nextInt());
        }
        while (!c.isEmpty()) {
            System.out.print(c.remove() + " ");

        }
    }
}

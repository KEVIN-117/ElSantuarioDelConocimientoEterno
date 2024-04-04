package org.example.N_6_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Example_1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Stack<Integer> p = new Stack<>();
        int n = x.nextInt();
        for (int i = 0; i < n; i++)
            p.push(x.nextInt());
        while (!p.isEmpty()) {
            System.out.print(p.pop()+ " ");
        }
    }
}

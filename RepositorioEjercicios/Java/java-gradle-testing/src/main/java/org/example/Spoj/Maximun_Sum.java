package org.example.Spoj;

import java.util.Scanner;

public class Maximun_Sum {
    static int[] list;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = (input.nextInt());
        }
        n = input.nextInt();
        for (int i = 0; i < n; i++) {
            fun(input.next(), input.nextInt()-1, input.nextInt());

        }
    }
    static void fun(String s, int x, int y){
        if (s.equals("Q")){
            System.out.println(list[x]+list[y-1]);
        } else if (s.equals("U")) {
            list[x] = y;
        }
    }
}

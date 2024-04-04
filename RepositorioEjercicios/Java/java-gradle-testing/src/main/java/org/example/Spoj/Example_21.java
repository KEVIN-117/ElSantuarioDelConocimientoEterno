package org.example.Spoj;

import java.util.Scanner;

public class Example_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int reverso = Integer.parseInt(new StringBuilder(i+"").reverse().toString());
            if (i == reverso){
                System.out.println(i);
            }
        }
    }
}

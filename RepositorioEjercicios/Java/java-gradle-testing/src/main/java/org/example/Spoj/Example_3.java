package org.example.Spoj;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        while (a >= 0){
            System.out.println(1 + a * 2);
            a = n.nextInt();
        }
    }
}

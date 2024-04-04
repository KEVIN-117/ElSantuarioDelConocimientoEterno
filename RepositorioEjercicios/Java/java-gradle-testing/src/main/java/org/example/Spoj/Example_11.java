package org.example.Spoj;

import java.util.Scanner;

public class Example_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(input.hasNext() && n != 42){
            System.out.println(n);
            n = input.nextInt();
        }
    }
}

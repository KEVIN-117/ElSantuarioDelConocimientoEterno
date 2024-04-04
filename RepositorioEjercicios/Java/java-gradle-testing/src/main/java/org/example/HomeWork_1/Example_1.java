package org.example.HomeWork_1;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int fac = 1;
        for (int i = 1; i <= number; i++){
            fac *= i;
        }
        System.out.println(fac);
    }
}

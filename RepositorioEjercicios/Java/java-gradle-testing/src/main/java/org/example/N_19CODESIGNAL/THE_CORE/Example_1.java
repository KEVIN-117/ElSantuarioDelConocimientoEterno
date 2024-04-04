package org.example.N_19CODESIGNAL.THE_CORE;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 254;
        int suma = 0;
        while (number > 0){
            System.out.println(number% 10);
            //System.out.println(number/ 10);
            suma += number% 10;
            number /= 10;
        }
        System.out.println();
        System.out.println(suma);
    }
}

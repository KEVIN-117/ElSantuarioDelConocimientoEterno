package org.example.N_19CODESIGNAL.THE_CORE;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long init = System.nanoTime();
        int n = 3;
        int counter = 0;
        while (Integer.parseInt(String.valueOf(String.valueOf(counter).length()))<= n){
            counter++;
        }
        System.out.println(counter-1);
    }

}

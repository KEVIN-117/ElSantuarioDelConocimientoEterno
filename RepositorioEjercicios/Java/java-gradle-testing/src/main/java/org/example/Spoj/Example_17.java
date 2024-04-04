package org.example.Spoj;

import java.util.Scanner;

public class Example_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int X = input.nextInt();
       // System.out.format("%1s %10s", "Entrada", "Salida");
        //System.out.println();
        while (M!=0 && X != 0){
           // System.out.format("%1s %10s ", M +" " + X ,fibo(X)%M);
            if (M<= 2 && M >=100 && X<=0 && X>= 1000000){
                System.out.println(fibo(X)%M);
            }
            M= input.nextInt();
            X = input.nextInt();
        }
    }
    static int fibo(int X){
        if(X == 0 || X == 1){
            return 1;
        }else
            return fibo(X-1)+fibo(X-2);
    }
}

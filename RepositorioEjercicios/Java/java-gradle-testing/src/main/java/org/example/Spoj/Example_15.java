package org.example.Spoj;

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int aux = 0;
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            aux = number;
            int adition = 0;
            while(number != 0){
                adition += factorial(number%10);
                number /= 10;
            }
            if (adition == aux ){
                System.out.println("Y");
            }else {
                System.out.println("N");
            }
        }
    }
    static int factorial(int n){
        if (n <= 1  )
            return 1;
        else
            return n*factorial(n-1);
    }
}

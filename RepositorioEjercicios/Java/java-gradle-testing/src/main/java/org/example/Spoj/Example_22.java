package org.example.Spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Example_22 {
    public static BigInteger A;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        if (t>= 1 && t<=100){
            for (int i = 0; i < t; i++) {
                long number = input.nextLong();
                if (number >= 1 && number <= 100){
                    fun(number);
                }
            }
        }
    }
    static void fun(long n){
        BigInteger A = new BigInteger(String.valueOf(n));
        for (int i = 1; i <= n; i++) {
            A = A.multiply(BigInteger.valueOf(i));
        }
        System.out.println(A);
    }
    static BigInteger fun2(long n){
        BigInteger A = new BigInteger(String.valueOf(n));
        if (n == 0 || n==1){
            return BigInteger.valueOf(1);
        }else {
            BigInteger save = fun2(n-1);
            return A.multiply(save);
        }
    }
}

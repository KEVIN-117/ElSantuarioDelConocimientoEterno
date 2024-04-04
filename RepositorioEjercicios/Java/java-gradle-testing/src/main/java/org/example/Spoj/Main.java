package org.example.Spoj;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            long number = input.nextLong();
            fun(number);
        }

    }
    static void fun(long n){
        BigInteger A = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            A = A.multiply(BigInteger.valueOf(i));
        }
        System.out.println(A);
    }
}
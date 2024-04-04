package org.example.Spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Example_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            BigInteger A = input.nextBigInteger();
            BigInteger B = input.nextBigInteger();
            System.out.println(A.multiply(B));
        }
    }

}

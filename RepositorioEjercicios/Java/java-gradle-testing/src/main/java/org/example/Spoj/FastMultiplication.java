package org.example.Spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class FastMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n ; i++) {
            long a = input.nextLong();
            long b = input.nextLong();
            System.out.println(new BigInteger(String.valueOf(a*b)));
        }
    }
}

package org.example.Spoj;

import java.math.BigInteger;
import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int A = input.nextInt();
            int B = input.nextInt();
            for (int j = A; j <B ; j++) {
                if (bigInteger.isProbablePrime(i))
                    System.out.println(j);
            }

            for (int j = A; j <= B; j++) {
                int counter = 0;
                for (int k = 2; k < j; k++) {
                    if (j%k == 0){
                        counter++;
                        break;
                    }
                }
                if (counter == 0){
                    System.out.println(j);
                }
            }
        }
    }
}

package org.example.N_1_ExamplesOfArrays;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        int i, j;
        for ( i= 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        for (i = 0; i < A.length; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(A[j] + " ");
            }
            System.out.println();
        }
    }
}

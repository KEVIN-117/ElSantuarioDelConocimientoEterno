package org.example.N_1_ExamplesOfArrays;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        for (int j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
        }
    }
}

package org.example.HomeWork_2;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        int i;
        for ( i= 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int mayor = 0;
        int index = 0;
        for (i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
                index = i;
            }
        }
        for (i = index+1; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

package org.example.N_2_ExamplesOfMatrix;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int[][] A = new int[M][N];

        int i,j;
        for (i = 0; i < A.length; i++) {
            for (j = 0; j < A[i].length; j++) {
                A[i][j] = input.nextInt();
            }
        }
        System.out.println();
        int fm = 0;
        int mayor = 0;
        for (i = 0; i < A.length; i++) {
            int suma = 0;
            for (j = 0; j < A[i].length; j++) {
                suma += A[i][j];
                //System.out.print(A[i][j] + " ");
            }
            //System.out.print(suma + " ");
            if (suma > mayor) {
                mayor = suma;
                fm = i;
            }
        }
        /*System.out.println();
        System.out.println(mayor + " ");*/
        for (int k = 0; k < N; k++) {
            System.out.print(A[fm][k] + " ");
        }
    }
}

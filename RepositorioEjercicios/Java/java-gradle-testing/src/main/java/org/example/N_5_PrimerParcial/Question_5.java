package org.example.N_5_PrimerParcial;

import java.util.Scanner;

public class Question_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int M = 3;//x.nextInt();
        int N = 5;//x.nextInt();
        int A[][] = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = x.nextInt();
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int contador =0;
                int k = 0;
                while (k<N) {
                    if (A[i][j]==A[i][k]) {
                        contador++;
                    }
                    k++;
                }
                if (contador==1) {
                    System.out.print(A[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

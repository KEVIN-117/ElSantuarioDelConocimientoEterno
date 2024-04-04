package org.example.N_2_ExamplesOfMatrix;

public class MatrixSnail {
    public static void main(String[] args) {
        int M = 4;
        int N = 4;
        int[][] A = new int[M][N];
        int number = 1;
        int row = 0;
        int index = 0;

        for (int j = 0; j < N; j++) {
            A[row][j] = number;
            number++;
            index=j;
        }
        for (int i = 1; i < M; i++) {
            A[i][index] = number;
            number++;
        }
        for (int i = N-2; i >= 0; i--) {
            A[index][i] = number;
            number++;
        }
        for (int i = 0; i < N-1; i++) {
            A[index-1][i]=number;
            number++;
        }
        System.out.println(index);
        System.out.println();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}


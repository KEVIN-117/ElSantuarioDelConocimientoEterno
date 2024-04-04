package org.example.HomeWork_3;
import java.util.Scanner;
/**
 * Realice un programa que permita insertar números en una matriz de tamaño M X N,
 * posteriormente muestre el número más grande de cada fila
 Ejemplo:
 *   Entrada           Salida
 3 4                 6 7 6
 4 6 2 2
 6 7 4 3
 3 6 3 1
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M = input.nextInt();
        int N = input.nextInt();
        int[][] A = new int[M][N];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < A.length; i++) {
            int bigNumberRow = 0;
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] > bigNumberRow) {
                    bigNumberRow = A[i][j];
                }
            }
            System.out.print(bigNumberRow + " ");
        }
    }
}

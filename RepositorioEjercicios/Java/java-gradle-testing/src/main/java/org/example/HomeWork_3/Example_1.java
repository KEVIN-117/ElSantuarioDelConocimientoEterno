package org.example.HomeWork_3;

import java.util.Scanner;
/**
 * Realice un programa que permita insertar números en una matriz de tamaño M X N,
 * posteriormentemuestre la cantidad de números pares de cada fila.
 Ejemplo:
 * Entrada               Salida
 3 4                 4 2 1
 4 6 2 2
 6 7 4 3
 3 6 3 1
 */
public class Example_1 {
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
            int pares = 0;
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] % 2 == 0) {
                    pares++;
                }
            }
            System.out.print(pares + " ");
        }
    }
}

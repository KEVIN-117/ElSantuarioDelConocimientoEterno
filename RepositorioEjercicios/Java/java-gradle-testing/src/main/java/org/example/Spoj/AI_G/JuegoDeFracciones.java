package org.example.Spoj.AI_G;

import java.util.Scanner;

public class JuegoDeFracciones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[][] matrix = new String[2][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.next();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String[] aux = matrix[i][j].split("/");
                System.out.print((double) Integer.parseInt(aux[0])/Integer.parseInt(aux[1]) +" ");
            }
            System.out.println();
        }
    }
}

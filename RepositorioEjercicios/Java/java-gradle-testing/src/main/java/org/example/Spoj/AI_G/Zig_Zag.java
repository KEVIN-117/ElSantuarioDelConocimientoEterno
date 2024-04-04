package org.example.Spoj.AI_G;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_Zag {
    static boolean[][] matrix;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        matrix = new boolean[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int number = input.nextInt();
                if (number == 0){
                    matrix[i][j] = false;
                } else if (number == 1) {
                    matrix[i][j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
    /*static void isZigZag(int i, int j, int counter) {
        int saveCounter = counter;
        counter = 0;
        if (i-1 >= 0 && i < matrix.length && j >= 0 && j+1 < matrix.length && matrix[i - 1][j + 1] == 1){
            isZigZag(i - 1, j + 1, counter);
            System.out.print(i + ","+j + " ");
        }if(i >= 0 && i < matrix.length && j >= 0 && j+1 < matrix.length && matrix[i][j + 1] == 1){
            isZigZag(i, j + 1, counter);
            System.out.print(i + "," + j + " ");
        }if (i >= 0 && i+1 < matrix.length && j >= 0 && j+1 < matrix.length && matrix[i + 1][j + 1] == 1){
            isZigZag(i + 1, j + 1, counter + 1);
            System.out.print(i + ","+j + " ");
        }if (i >= 0 && i+1 < matrix.length && j >= 0 && j < matrix.length && matrix[i + 1][j] == 1){
            isZigZag(i + 1, j, counter);
            System.out.print(i + "," + j + " ");
        }if (i+1 >= 0 && i < matrix.length && j-1 >= 0 && j < matrix.length && matrix[i + 1][j - 1] == 1){
            isZigZag(i + 1, j - 1, counter);
            System.out.print(i + ","+j + " ");
        }if (i >= 0 && i < matrix.length && j-1 >= 0 && j < matrix.length && matrix[i][j - 1] == 1){
            isZigZag(i, j - 1, counter);
            System.out.print(i + ","+j + " ");
        }if (i-1 >= 0 && i < matrix.length && j-1 >= 0 && j < matrix.length && matrix[i - 1][j - 1] == 1){
            isZigZag(i - 1, j - 1, counter);
            System.out.print(i + "," + j + " ");
        }
        if (i-1 >= 0 && i < matrix.length && j >= 0 && j < matrix.length && matrix[i - 1][j] == 1){
            isZigZag(i - 1, j, counter);
            System.out.print(i + ","+j + " ");
        }
    }*/
}

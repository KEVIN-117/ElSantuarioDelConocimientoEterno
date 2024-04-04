package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;

public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = validator(matrix, i, j);
            }
        }
        return result;
    }

     int validator(boolean[][] matrix, int x, int y){
        int counter = 0;

            if (y-1 >= 0 && matrix[x][y-1]) {
                counter++;
            } if (y + 1 < matrix[0].length && matrix[x][y+1]) {
                counter++;
            } if (x+1 < matrix.length && matrix[x+1][y]) {
                counter++;
            } if (x-1 >= 0 && y < matrix[0].length && matrix[x-1][y]) {
                counter++;
            } if (x-1 >= 0 && y-1 >= 0 && matrix[x-1][y-1]) {
                counter++;
            } if (x-1 >= 0 && y+1 < matrix[0].length && matrix[x-1][y+1]) {
                counter++;
            } if (x+1 < matrix.length && y+1 < matrix[0].length && matrix[x+1][y+1]) {
                counter++;
            } if (x+1 < matrix.length && y-1 >= 0 && matrix[x+1][y-1]) {
                counter++;
            }

         return counter;
     }

    public static void main(String[] args) {
        Minesweeper minesweeper = new Minesweeper();
        boolean input[][] = new boolean[][]{{true,false,false},
                                            {false,true,false},
                                            {false,false,false}};
        System.out.println(Arrays.deepToString(minesweeper.solution(input)));
        input = new boolean[][]{{false,true, true, false},
                                {true ,true, false,true},
                                {false,false,true, false}};
        System.out.println();
        System.out.println(Arrays.deepToString(minesweeper.solution(input)));
    }
}

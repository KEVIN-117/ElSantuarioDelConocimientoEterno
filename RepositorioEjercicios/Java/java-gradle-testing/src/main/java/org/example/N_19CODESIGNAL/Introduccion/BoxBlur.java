package org.example.N_19CODESIGNAL.Introduccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoxBlur {
    int[][] solution(int[][] image) {
        int row = image.length;
        int column = image[0].length;
        int[][] result = new int[row-2][column-2];
        for (int i = 0; i < row-2; i++) {
            for (int j = 0; j < column-2; j++) {
                result[i][j] = avg(image, i, j);
            }
        }
        return result;
    }

    int avg(int[][] image, int x, int y) {
        int sum = 0;
        for (int i = x; i <= x+2; i++) {
            for (int j = y; j <= y+2; j++) {
                sum += image[i][j];
            }
        }
        return sum/9;
    }
    public static void main(String[] args) {
        BoxBlur blur = new BoxBlur();
        int[][] image = {{7, 4, 0, 1},
                         {5, 6, 2, 2},
                         {6, 10, 7, 8},
                         {1, 4, 2, 0}};
        System.out.println();
        System.out.println(Arrays.deepToString(blur.solution(image)));
        System.out.println();
        image = new int[][]{{1, 1, 1},
                            {1, 7, 1},
                            {1, 1, 1}};
        System.out.println();
        System.out.println(Arrays.deepToString(blur.solution(image)));
        System.out.println();
        /*image = new int[][]{{36,0,18,9},
                {27,54,9,0},
                {81,63,72,45}};
        System.out.println();
        System.out.println(Arrays.deepToString(blur.solution(image)));
        System.out.println();
        image = new int[][]{{36, 0, 18, 9, 9, 45, 27},
                            {27, 0, 54, 9, 0, 63, 90},
                            {81, 63, 72, 45, 18, 27, 0},
                            {0,  0, 9, 81, 27, 18, 45},
                            {45, 45, 27, 27, 90, 81, 72},
                            {45, 18, 9, 0, 9, 18, 45},
                            {27, 81, 36, 63, 63, 72, 81}
        };
        System.out.println();
        System.out.println(Arrays.deepToString(blur.solution(image)));
        System.out.println();*/
    }
}
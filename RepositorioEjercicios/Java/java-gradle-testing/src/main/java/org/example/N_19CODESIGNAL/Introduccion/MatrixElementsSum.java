package org.example.N_19CODESIGNAL.Introduccion;


public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = {  {0, 1, 1, 2},
                            {0, 5, 0, 0},
                            {2, 0, 3, 3}};
        //System.out.println(matrix.length);
        System.out.println(matrixElementsSum(matrix));
        //int[][] matrix2 = { {1, 1, 1, 0},
        //                    {0, 5, 0, 1},
        //                    {2, 1, 3, 10}};
        //System.out.println(matrixElementsSum(matrix2));

    }
    public static int matrixElementsSum(int[][] matrix) {
        int suma = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int j = 0;
            while (j < matrix.length){
                if (!(matrix[j][i] == 0)){
                    suma += matrix[j][i];
                }else {
                    break;
                }
                j++;
            }
        }
        return suma;
    }

}

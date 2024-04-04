package org.example.Sis211;

public class Matrices {
    public static void main(String[] args) {
        int[] fila1 = {10, 50, 9, 80, 60};
        int[] fila2 = {53, 80, 60, 99, 10};

        int[][] matriz = {
                fila1,
                fila2,
                {10, 33, 30, 80, 60}
        };

        int matriz_2[][] = new int[5][5];
        matriz_2[2][2] = 10;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] % 2 == 0){
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}

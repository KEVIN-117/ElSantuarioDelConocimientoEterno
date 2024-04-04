package org.example.N_14ExamenFinal;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    static boolean[][] modifiedChessboard;
    static boolean[][] visited;
    static int saveResult;

    public static boolean isPossible(int row, int colum){
        if (row > 9 || row < 0 || colum > 9 || colum < 0)
            return false;
        if (!modifiedChessboard[row][colum])
            return false;
        if (visited[row][colum])
            return false;

        return true;
    }
    public static void FunctionRecursive(int row, int column, int resultTemp){

        visited[row][column] = true;
        saveResult = Math.max(saveResult, resultTemp);

        if (isPossible(row-2, column-1))
            FunctionRecursive( row-2, column-1, resultTemp+1 );

        if (isPossible(row-2, column+1))
            FunctionRecursive( row-2, column+1, resultTemp+1 );

        if (isPossible(row+2, column-1))
            FunctionRecursive( row+2, column-1, resultTemp+1 );

        if (isPossible(row+2, column+1))
            FunctionRecursive( row+2, column+1, resultTemp+1 );

        if (isPossible(row-1, column-2))
            FunctionRecursive( row-1, column-2, resultTemp+1 );

        if (isPossible(row-1, column+2))
            FunctionRecursive( row-1, column+2, resultTemp+1 );

        if (isPossible(row+1, column-2))
            FunctionRecursive( row+1, column-2, resultTemp+1 );

        if (isPossible(row+1, column+2))
            FunctionRecursive( row+1, column+2, resultTemp+1 );

        visited[row][column] = false;
    }

    public static void main(String[] args) {
        modifiedChessboard = new boolean[10][10];
        visited = new boolean[10][10];
        int counterCase=0, i, j, amountSquares;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while (N != 0){
            for (i = 0; i <modifiedChessboard.length ; i++) {
                Arrays.fill(modifiedChessboard[i],0,10, false);
                Arrays.fill(visited[i], 0, 10, false);
            }
            amountSquares = 0;
            int row = 0;
            for (i = 0; i <N ; i++) {
                int startIndex = input.nextInt();
                int finishIndex = input.nextInt();
                int column = startIndex;
                for (j = 0; j < finishIndex; j++) {
                    modifiedChessboard[row][column] = true;
                    amountSquares ++;
                    column++;
                }
                row++;
            }
            FunctionRecursive(0, 0, 1);
            saveResult = amountSquares-saveResult;
            counterCase++;
            System.out.println("Case " + counterCase + ", " + + saveResult +((saveResult == 1)? " square " : " squares ") +" can not be reached. " );
            N = input.nextInt();
        }
    }
}

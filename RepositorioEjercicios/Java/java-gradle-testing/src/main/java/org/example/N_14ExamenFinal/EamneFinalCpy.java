package org.example.N_14ExamenFinal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class EamneFinalCpy {
    static boolean[][] board;
    static boolean[][] visited;
    static int saveResult;

    public static boolean possible(int row, int colum){
        if (row > 9 || colum < 0 || colum > 9 || colum < 0)
            return false;
        if (!board[row][colum])
            return false;
        return true;
    }
    public static void FunctionRecursive(int row, int column, int cur){

        visited[row][column] = true;
        saveResult = Math.max(saveResult, cur);

        if (possible(row-2, column-1))
            FunctionRecursive( row-2, column-1, cur+1 );

        if (possible(row-2, column+1))
            FunctionRecursive( row-2, column+1, cur+1 );

        if (possible(row+2, column-1))
            FunctionRecursive( row+2, column-1, cur+1 );

        if (possible(row+2, column+1))
            FunctionRecursive( row+2, column+1, cur+1 );

        if (possible(row-1, column-2))
            FunctionRecursive( row-1, column-2, cur+1 );

        if (possible(row-1, column+2))
            FunctionRecursive( row-1, column+2, cur+1 );

        if (possible(row+1, column-2))
            FunctionRecursive( row+1, column-2, cur+1 );

        if (possible(row+1, column+2))
            FunctionRecursive( row+1, column+2, cur+1 );

        visited[row][column] = false;
    }

    public static void main(String[] args) {
        board = new boolean[10][10];
        visited = new boolean[10][10];
        int caseCounter=0, i, j, amountSquares;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        while (N != 0){
            for (i = 0; i <board.length ; i++) {
                Arrays.fill(board[i],0,10, false);
                Arrays.fill(visited[i], 0, 10, false);
            }
            amountSquares = 0;
            int counterx = 0;
            for (i = 0; i <N ; i++) {
                int start = input.nextInt();
                int finish = input.nextInt();
                int counterY = start;
                for (j = 0; j < finish; j++) {
                    board[counterx][counterY] = true;
                    amountSquares ++;
                    counterY++;
                }
                counterx++;
            }
            FunctionRecursive(0, 0, 1);
            saveResult = amountSquares-saveResult;
            caseCounter++;
            System.out.println("Case " + caseCounter + " can not be reached.\n" + saveResult + ((saveResult == 1)? "square" : "squares"));
            N = input.nextInt();
        }
    }
}

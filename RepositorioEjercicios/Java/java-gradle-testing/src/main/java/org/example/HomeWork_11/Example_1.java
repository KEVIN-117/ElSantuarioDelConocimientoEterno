package org.example.HomeWork_11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example_1 {
    static int lengthMatrix;
    static int[][] matrix;

    public static void main(String[] args) {
        lengthMatrix = 8;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[0][1] = 1; matrix[1][0] = 1;
        matrix[0][2] = 1; matrix[2][0] = 1;
        matrix[0][3] = 1; matrix[3][0] = 1;

        matrix[1][4] = 1; matrix[4][1] = 1;
        matrix[2][4] = 1; matrix[4][2] = 1;
        matrix[2][5] = 1; matrix[5][2] = 1;

        matrix[3][5] = 1; matrix[5][3] = 1;

        matrix[4][1] = 1; matrix[1][4] = 1;
        matrix[4][2] = 1; matrix[2][4] = 1;
        matrix[4][5] = 1; matrix[5][4] = 1;
        matrix[4][6] = 1; matrix[6][4] = 1;

        matrix[5][2] = 1; matrix[2][5] = 1;
        matrix[5][3] = 1; matrix[3][5] = 1;


        matrix[6][7] = 1; matrix[7][6] = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        tourDepth(5);
        System.out.println();
        jwe(5);
    }
    static void tourDepth(int root){
        Stack<Integer> stack = new Stack<>();
        int isVisited[] = new int[matrix.length];
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            if (isVisited[x] == 0){
                System.out.print(x + " ");
                isVisited[x] = 1;
                for (int i = matrix.length-1; i >= 0; i--){
                    if (matrix[x][i] == 1 && isVisited[i] == 0){
                        stack.push(i);
                    }
                }
            }
        }
    }
    static void jwe(int root){
        Queue<Integer> stack = new LinkedList<>();
        int isVisited[] = new int[matrix.length];
        stack.add(root);
        while (!stack.isEmpty()){
            int x = stack.remove();
            if (isVisited[x] == 0){
                System.out.print(x + " ");
                isVisited[x] = 1;
                for (int i = 0; i < matrix.length ; i++){
                    if (matrix[x][i] == 1 && isVisited[i] == 0){
                        stack.add(i);
                    }
                }
            }
        }
    }
}

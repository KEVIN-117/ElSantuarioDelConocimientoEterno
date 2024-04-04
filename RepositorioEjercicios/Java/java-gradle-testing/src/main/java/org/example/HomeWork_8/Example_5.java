package org.example.HomeWork_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example_5 {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 10;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[0][1] = 1; matrix[0][2] = 1;
        matrix[1][3] = 1; matrix[1][4] = 1;
        matrix[2][5] = 1; matrix[2][6] = 1;
        matrix[5][7] = 1; matrix[5][8] = 1;
        matrix[6][9] = 1;

        tourDepth(0);
        System.out.println();
        tourLength(0);
    }
    static void tourDepth(int root){
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            System.out.print(x + " ");
            for (int i = matrix.length-1; i >= 0; i--) {
                if (matrix[x][i] == 1){
                    stack.push(i);
                }
            }
        }
    }
    static void tourLength(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int x = queue.remove();
            System.out.print(x + " ");
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[x][i] == 1){
                    queue.add(i);
                }
            }
        }
    }
}

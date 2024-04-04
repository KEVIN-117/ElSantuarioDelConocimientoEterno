package org.example.N_9_SegundoParcial;

import java.util.Stack;

public class Question_3 {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 6;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[3][0] = 1; matrix[3][1] = 1; matrix[3][2] = 1;
        matrix[1][4] = 1;
        matrix[2][5] = 1;
        tourTree(3);
    }
    static void tourTree(int root){
        Stack<Integer> p = new Stack<Integer>();
        Stack<Integer> k = new Stack<Integer>();
        p.push(root);
        k.push(root);
        while(!p.isEmpty()){
            int x = p.pop();
            int y = k.pop();
            System.out.print(y + " ");
            for (int i = matrix.length-1; i > -1; i--) {
                if (matrix[x][i] == 1){
                    p.push(i);
                    k.push(y+i);
                }
            }
        }
    }
}

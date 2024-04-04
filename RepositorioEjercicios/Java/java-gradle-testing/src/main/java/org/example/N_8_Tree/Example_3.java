package org.example.N_8_Tree;

import java.util.Stack;

public class Example_3 {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 9;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[3][2] = 1;       matrix[3][6] = 1;
        matrix[2][0] = 1;       matrix[2][1] = 1;
        matrix[6][5] = 1;       matrix[6][7] = 1;
        matrix[1][4] = 1;       matrix[7][8] = 1;

        branchesTree(3);

    }
    static void branchesTree(int root){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> level = new Stack<>();
        stack.push(root);
        level.push(0);
        while (!level.isEmpty()){
            int x = stack.pop();
            int n = level.pop();
            System.out.println(x);
            for (int i = matrix.length-1; i >= 0 ; i--) {
                if (matrix[x][i] == 1){
                    stack.push(i);
                    level.push(n+1);
                }
            }
        }
    }
}

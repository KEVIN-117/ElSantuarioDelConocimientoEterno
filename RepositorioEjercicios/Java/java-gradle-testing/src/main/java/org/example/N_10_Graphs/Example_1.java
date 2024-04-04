package org.example.N_10_Graphs;

import java.util.Stack;

public class Example_1 {
    private static int Length;
    private static int[][] Matrix;

    public static void main(String[] args) {
        Length = 9;
        Matrix = new int[Length][Length];
        Matrix[1][0] = 1; Matrix[0][1] = 1;
        Matrix[1][2] = 1; Matrix[2][1] = 1;
        tourDepth(1);


    }
    static void tourDepth(int root){
        Stack<Integer> stack = new Stack<>();
        int[] isVisited = new int[Matrix.length];
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            if (isVisited[x] == 0){
                System.out.print(x + " ");
                isVisited[x] = 1;
                for (int i = Matrix.length-1; i >=0 ; i--) {
                    if (Matrix[x][i] == 1 & isVisited[i] == 0){
                        stack.push(i);
                    }
                }
            }

        }
    }
}

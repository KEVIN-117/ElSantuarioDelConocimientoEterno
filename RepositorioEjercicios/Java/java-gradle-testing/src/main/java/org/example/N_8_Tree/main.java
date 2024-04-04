package org.example.N_8_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class main {
    static  int[][] matrix;
    static int lengthMatrix;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        lengthMatrix = 9;
        matrix = new int[lengthMatrix][lengthMatrix];
        /*for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j]= input.nextInt();
            }
        }*/
        matrix[2][1] = 1; matrix[2][5] = 1;
        matrix[1][0] = 1; matrix[1][4] = 1;
        matrix[5][7] = 1; matrix[5][8] = 1;
        matrix[4][3] = 1; matrix[4][6] = 1;
        System.out.println("The tree is:");
        depth(2);
        System.out.println();
        anch(2);

    }
    static void depth(int root){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            System.out.print(x + " ");
            for (int i = matrix.length-1; i >= 0 ; i--) {
                if (matrix[x][i] == 1){
                    stack.push(i);
                }
            }
        }
    }

    static void anch(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int x = queue.remove();
            System.out.print(x + " ");
            for (int i = 0; i < matrix.length ; i++) {
                if (matrix[x][i] == 1){
                    queue.add(i);
                }
            }
        }
    }
}

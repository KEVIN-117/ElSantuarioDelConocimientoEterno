package org.example.N_8_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/*
                                                   (3)
                                      ____________/   \____________
                                      |                           |
                                     (2)                         (6)
                            ________/   \________       ________/   \________
                            |                   |       |                   |
                           (0)                 (1)     (5)                 (7)
                                                \                           \
                                                (4)                         (8)
 */
public class Example_2 {
    static  int[][] matrix;
    static int lengthMatrix;
    public static void main(String[] args) {
        System.out.println("Muetra las hojas del arbol del nivel 2");
        Scanner input = new Scanner(System.in);
        lengthMatrix = 9;
        matrix = new int[lengthMatrix][lengthMatrix];
        /*for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j]= input.nextInt();
            }
        }*/
        matrix[3][2] = 1; matrix[3][6] = 1;
        matrix[2][0] = 1; matrix[2][1] = 1;
        matrix[6][5] = 1; matrix[6][7] = 1;
        matrix[1][4] = 1; matrix[7][8] = 1;
        System.out.println("The tree is:");
        depth(3);
        System.out.println();
        anch(3);

    }
    static void depth(int root){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> level = new Stack<Integer>();
        stack.push(root);
        level.push(0);
        while (!stack.isEmpty()){
            int x = stack.pop();
            int n = level.pop();
            int counter = 0;
            for (int i = matrix.length-1; i >= 0 ; i--) {
                if (matrix[x][i] == 1){
                    stack.push(i);
                    level.push(n+1);
                    counter++;
                }
            }
            if (counter == 0 && n==2){
                System.out.print(x + " ");
            }
        }
    }

    static void anch(int root){
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        queue.add(root);
        level.add(0);
        while (!queue.isEmpty()){
            int x = queue.remove();
            int n = level.remove();
            int counter = 0;
            for (int i = 0; i < matrix.length ; i++) {
                if (matrix[x][i] == 1){
                    queue.add(i);
                    level.add(n+1);
                    counter++;
                }
            }
            if (counter == 0 && n ==2){
                System.out.print(x + " ");
            }
        }
    }
}

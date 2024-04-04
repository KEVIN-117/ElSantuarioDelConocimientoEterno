package org.example.HomeWork_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Tree {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 15;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[6][4] = 1;   matrix[6][5] = 1;
        matrix[4][0] = 1;   matrix[5][7] = 1;   matrix[5][8] = 1;
        matrix[0][1] = 1;   matrix[0][2] = 1;   matrix[0][3] = 1;
        matrix[7][11] = 1;  matrix[7][12] = 1;  matrix[8][13] = 1;
        matrix[8][14] = 1;  matrix[2][9] = 1;   matrix[2][10] = 1;

        a(6);
        System.out.println();
        b(6);
        System.out.println();
        c(6);
        System.out.println();
        d(6);
        System.out.println();
        e(6);
    }
    private static void a(int root) {
        Stack<Integer> stack = new Stack<Integer>();
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
    static void b(int root){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(root);
        while (!queue.isEmpty()){
            int x = queue.remove();
            int counter = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[x][i] == 1){
                    queue.add(i);
                    counter++;
                }
            }
            if (counter == 2){
                System.out.print(x + " ");
            }
        }
    }
    static void c(int root){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root);
        int printNode = 0;
        int counter = 0;
        while (!stack.isEmpty()){
            int x = stack.pop();
            int counterAux = 0;
            for (int i = matrix.length-1; i >= 0; i--) {
                if (matrix[x][i] == 1){
                    stack.push(i);
                    counterAux++;
                }
            }
            if (counterAux > counter){
                counter = counterAux;
                printNode = x;
            }
        }
        System.out.print(printNode);
    }
    static void d(int root){
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> level = new Stack<Integer>();
        int[] array = new int[lengthMatrix];
        stack.push(root);
        level.push(0);
        while (!stack.isEmpty()){
            int x = stack.pop();
            int n = level.pop();
            int counter = 0;
            array[n] = x;
            for (int i = matrix.length-1; i >= 0; i--){
                if(matrix[x][i] == 1){
                    stack.push(i);
                    level.push(n+1);
                }
            }
            if (counter == 0 && array[n] == 12){
                for (int i = 0; i <= n; i++){
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
    static void e(int root){
        Stack<Integer> queue = new Stack<Integer>();
        Stack<Integer> level = new Stack<Integer>();
        queue.push(root);
        level.push(0);
        while(!queue.isEmpty()){
            int x = queue.pop();
            int y = level.pop();
            for (int i = matrix.length-1; i >= 0 ; i--) {
                if (matrix[x][i] == 1){
                    queue.push(i);
                    level.push(y+1);
                }
            }
            if (y == 3){
                System.out.print(x + " ");
            }
        }
    }
}

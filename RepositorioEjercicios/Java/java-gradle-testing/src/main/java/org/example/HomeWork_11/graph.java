package org.example.HomeWork_11;
import java.util.Stack;
public class graph {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 9;
        matrix = new int[lengthMatrix][lengthMatrix];

        matrix[7][0] = 1; matrix[0][7] = 1;
        matrix[0][5] = 1; matrix[5][0] = 1;
        matrix[0][3] = 1; matrix[3][0] = 1;
        matrix[5][6] = 1; matrix[6][5] = 1;
        matrix[5][2] = 1; matrix[2][5] = 1;
        matrix[5][4] = 1; matrix[4][5] = 1;
        matrix[4][2] = 1; matrix[2][4] = 1;
        matrix[4][7] = 1; matrix[7][4] = 1;
        matrix[4][8] = 1; matrix[8][4] = 1;
        matrix[8][1] = 1; matrix[1][8] = 1;


        tourDepth(4);
        System.out.println();
        b(4);
        System.out.println();
        c(4);
        System.out.println();
        d(4);
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
                    if (matrix[x][i] == 1 & isVisited[i] == 0){
                        stack.push(i);
                    }
                }
            }
        }
    }
    static void b(int root){
        Stack<Integer> stack = new Stack<>();
        int[] isVisited = new int[matrix.length];
        stack.push(root);
        while(!stack.isEmpty()){
            int x = stack.pop();
            if (isVisited[x] == 0){
                if (x%2 == 0)
                    System.out.print(x + " ");
                isVisited[x] = 1;
                for (int i = matrix.length-1; i >= 0 ; i--) {
                    if (matrix[x][i] == 1 & isVisited[i] == 0){
                        stack.push(i);
                    }
                }
            }
        }
    }
    static void c(int root){
        Stack<Integer> stack = new Stack<>();
        int isVisited[] = new int[matrix.length];
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            int counter = 0;
            if(isVisited[x] == 0){
                isVisited[x] = 1;
                for (int i = matrix.length-1; i >=0 ; i--) {
                    if (matrix[x][i] == 1){
                        counter++;
                        if(isVisited[i] == 0){
                            stack.push(i);
                        }
                    }
                }
            }
            if (counter == 1)
                System.out.print(x + " ");
        }
    }
    static void d(int root){
        Stack<Integer> stack = new Stack<>();
        int isVisited[] = new int[matrix.length];
        int con = 0;
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            if(isVisited[x] == 0){
                isVisited[x] = 1;
                int counter = 0;
                for (int i = matrix.length-1; i >=0 ; i--) {
                    if (matrix[x][i] == 1){
                        counter++;
                        if(isVisited[i] == 0){
                            stack.push(i);
                        }
                    }
                }
                if (counter < 2){
                    con++;
                }
            }
        }
        System.out.println(con);
    }
}

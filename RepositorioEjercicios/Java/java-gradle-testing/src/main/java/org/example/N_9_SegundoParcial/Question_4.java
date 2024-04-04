package org.example.N_9_SegundoParcial;
import java.util.*;
public class Question_4 {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 6;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[3][0] = 1; matrix[3][1] = 1; matrix[3][2] = 1;
        matrix[1][4] = 1;
        matrix[2][5] = 1;
        //tourTree(3);
        d(3);
    }
    static void tourTree(int root){
        Queue<Integer> c = new LinkedList<Integer>();
        Queue<Integer> level = new LinkedList<Integer>();
        Queue<Integer> con = new LinkedList<>();
        c.add(root);
        level.add(0);
        con.add(0);
        while(!c.isEmpty()){
            int x = c.remove();
            int y = level.remove();
            int contador = 0;
            while(!con.isEmpty()){
                if (con.peek() == y){
                    contador++;
                    con.remove();
                }
            }
            System.out.print(contador + " ");
            for(int i=0; i< matrix.length; i++){
                if(matrix[x][i] == 1){
                    c.add(i);
                    level.add(y+1);
                    con.add(y+1);
                }
            }
        }
    }
    static void d(int root){
        Queue<Integer> stack = new LinkedList<>();
        Queue<Integer> level = new LinkedList<>();
        int[][] array = new int[lengthMatrix][lengthMatrix];
        stack.add(root);
        level.add(0);
        while (!stack.isEmpty()){
            int x = stack.remove();
            int n = level.remove();
            int counter = 0;
            array[n][x] = x+1;
            for (int i = 0; i < matrix.length; i++){
                if(matrix[x][i] == 1){
                    stack.add(i);
                    level.add(n+1);
                    counter++;
                }
            }

        }

        /*for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++){
            int counter = 0;
            for (int j = 0; j < matrix[i].length ; j++) {
                if (matrix[i][j] != 0){
                    counter++;
                }
            }
            if (counter!=0)
                System.out.print(counter + " ");
        }*/
    }
}

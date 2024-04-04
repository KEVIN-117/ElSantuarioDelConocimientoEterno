package org.example.N_10_Graphs;
import java.util.Stack;
public class Example_2 {
    static int lengthMatrix;
    static int[][] matrix;
    public static void main(String[] args) {
        lengthMatrix = 4;
        matrix = new int[lengthMatrix][lengthMatrix];
        matrix[0][3]=1;
        matrix[3][0]=1;
        matrix[0][1]=1;
        matrix[1][0]=1;
        matrix[1][3]=1;
        matrix[3][1]=1;
        matrix[1][2]=1;
        matrix[2][1]=1;
        matrix[3][2]=1;
        matrix[2][3]=1;
        tourBranch(0);
    }
    static void tourBranch(int root){
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> level = new Stack<>();
        int[] isInBranch = new int[matrix.length];
        stack.push(root);
        level.push(0);
        while(!stack.isEmpty()){
            int x = stack.pop();
            int y = level.pop();
            System.out.print( x + " ");
            isInBranch[y] = x;
            for (int i = matrix.length-1; i >= 0; i--) {
                if (matrix[x][i] == 1){
                    int found = 0;
                    for (int j = 0; j < y; j++) {
                        if (isInBranch[j] == i){
                            found = 1;
                        }
                    }
                    if (found == 0){
                        stack.push(i);
                        level.push(y+1);
                    }
                }
            }
        }
    }
}

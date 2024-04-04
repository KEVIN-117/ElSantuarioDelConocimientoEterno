package org.example.N_8_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example_1 {
    static int len;
    static int[][] three;
    public static void main(String[] args) {
        len = 9;
        three = new int[len][len];
        three[2][0] = 1;
        three[2][1] = 1;
        three[1][3] = 1;
        three[1][4] = 1;
        System.out.println("tour in depth");
        tourDepth(2);
        System.out.println("\ntour in Width");
        tourWidth(2);
    }
    static void tourDepth(int root){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root);
        while (!stack.isEmpty()){
            int x = stack.pop();
            System.out.print(x + " ");
            for (int i = three.length-1; i >=0 ; i--) {
                if (three[x][i] == 1){
                    stack.push(i);
                }
            }
        }
    }
    static void tourWidth(int root){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int x = queue.remove();
            System.out.print(x + " ");
            for (int i = 0; i < three.length; i++) {
                if (three[x][i] == 1){
                    queue.add(i);
                }
            }
        }
    }
}

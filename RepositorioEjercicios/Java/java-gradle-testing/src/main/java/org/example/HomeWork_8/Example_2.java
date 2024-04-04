package org.example.HomeWork_8;

import java.util.Stack;

public class Example_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        while (!stack.isEmpty()){
            int a = stack.pop();
            System.out.print(a + " ");
            if (a > 3){
                stack.push(a/3);
                stack.push(a/2);
            }
        }
    }
}

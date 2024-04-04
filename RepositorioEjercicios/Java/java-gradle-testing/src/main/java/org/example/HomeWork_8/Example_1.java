package org.example.HomeWork_8;

import java.util.Stack;

public class Example_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        while (!stack.isEmpty()){
            int a = stack.pop();
            System.out.print(a + " ");
            if (a>2){
                stack.push(a-3);
                stack.push(a-2);
                stack.push(a-1);
            }
        }
    }
}

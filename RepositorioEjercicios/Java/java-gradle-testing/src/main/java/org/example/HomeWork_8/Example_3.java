package org.example.HomeWork_8;

import java.util.Scanner;
import java.util.Stack;

public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            stack1.push(input.nextInt());
        }
        while (!stack1.isEmpty()){
            if (stack1.peek() % 2 == 0){
                stack2.push(stack1.pop());
            }else {
                stack3.push(stack1.pop());
            }
        }
        while (!stack2.isEmpty()){
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
        while (!stack3.isEmpty()){
            System.out.print(stack3.pop() + " ");
        }
    }
}

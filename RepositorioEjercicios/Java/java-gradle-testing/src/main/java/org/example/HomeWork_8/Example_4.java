package org.example.HomeWork_8;

import java.util.Scanner;
import java.util.Stack;

public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(input.next());
        }
        while (!stack.isEmpty()){
            if (stack.peek().charAt(0) == 'a' || stack.peek().charAt(0) == 'A'){
                System.out.print(stack.pop() + " ");
            }else {
                stack.pop();
            }
        }
    }
}

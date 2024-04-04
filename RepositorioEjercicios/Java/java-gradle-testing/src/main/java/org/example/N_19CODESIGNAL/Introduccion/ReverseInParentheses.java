package org.example.N_19CODESIGNAL.Introduccion;

import java.util.*;


public class ReverseInParentheses {
    public static void main(String[] args) {
        System.out.println(solution("foo(bar)baz"));
        System.out.println(solution("foo(bar)baz(blim)"));
        System.out.println(solution("foo(bar(baz))blim"));
        System.out.println(solution("(bar)"));
    }
    static String solution(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char i: inputString.toCharArray()) {
            if (i == ')'){
                StringBuilder builder = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != '('){
                    builder.append(stack.pop());
                }

                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    for (char c: builder.toString().toCharArray()) {
                        stack.add(c);
                    }
                }
            }else {
                stack.add(i);
            }
        }
        StringBuilder builder = new StringBuilder();
        while (!stack.isEmpty())
            builder.append(stack.pop());
        return builder.reverse().toString();
    }
}

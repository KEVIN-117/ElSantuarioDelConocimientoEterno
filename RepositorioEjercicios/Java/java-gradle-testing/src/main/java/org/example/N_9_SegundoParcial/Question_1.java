package org.example.N_9_SegundoParcial;

import java.util.Stack;

public class Question_1 {
    public static void main(String[] args) {
        Stack<Integer> p = new Stack<>();
        p.push(1);
        while (!p.isEmpty()){
            int a = p.pop();
            System.out.print(a + " ");
            if(a<3){
                p.push(a+3);
                p.push(a+2);
                p.push(a+1);
            }
        }
    }
}

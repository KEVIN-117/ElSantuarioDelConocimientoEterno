package org.example.N_6_Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Example_3 {
    public static void main(String[] args) {
        //String A = "alpaca";
        //System.out.println(RecordandoStrings(A, A.length(), 0));
        //System.out.println(RecordandoStrings2(A, 0));
        Scanner x = new Scanner(System.in);
        String A = x.next();
        Stack<Character> p = new Stack<Character>();
        int bag = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i)=='(')
                p.push('(');
            else{
                if(p.isEmpty()){
                    bag = 1;
                    break;
                }else
                    p.pop();
            }
        }
        if (bag == 0 && p.isEmpty()) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    static int RecordandoStrings(String A, int tam, int con){
        for (int i = 0; i < tam; i++) {
            if (A.charAt(i)=='a')
                con++;
        }
        return con;

    }
    static int RecordandoStrings2(String A, int con){
        String[] B = A.split("");
        for (int i = 0; i < B.length; i++) {
            if (B[i].equals("a"))
                con++;
        }
        return con;

    }
}

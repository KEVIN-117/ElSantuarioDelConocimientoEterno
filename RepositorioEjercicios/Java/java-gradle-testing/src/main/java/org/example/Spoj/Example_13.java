package org.example.Spoj;

import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            String A = input.next();
            String B = input.next();
            if (A.contains(B)){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }
    }
}

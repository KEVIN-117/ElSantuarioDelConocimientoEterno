package org.example.Spoj;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a1,b1,a2,b2;
        while(true){
            a1 = x.nextInt();
            b1 = x.nextInt();
            a2 = x.nextInt();
            b2 = x.nextInt();
            if(a1+a2+b1+b2 == 0)
                break;
            else
                System.out.println(fun(a1, b1, a2, b2));
        }
    }
    static String fun(int a1, int b1, int a2, int b2){
        if((float)a1/b1 == (float)a2/b2)
            return "=";
        return "!=";
    }
}

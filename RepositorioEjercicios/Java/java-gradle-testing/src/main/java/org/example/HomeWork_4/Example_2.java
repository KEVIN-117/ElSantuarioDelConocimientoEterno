package org.example.HomeWork_4;

public class Example_2 {
    public static void main(String[] args) {
        System.out.println(function(1, 2, 3, 4));
        System.out.println(function(1, 6, 3, 4));
        System.out.println(function(6, 2, 7, 4));
    }
    static int function(int a, int b, int c, int d){
        int m = a;
        if (b > m)
            m = b;
        if (c > m)
            m = c;
        if (d > m)
            m = d;
        return m;
    }
}

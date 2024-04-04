package org.example.HomeWork_4;

public class Example_4 {
    public static void main(String[] args) {
        System.out.println(digit(234));
        System.out.println(digit(2931));
    }
    static int digit(int a){
        int m = 0;
        while (a > 0){
            if(a % 10 > m)
                m = a%10;
            a /= 10;
        }
        return m;
    }
}

package org.example.HomeWork_4;

public class Example_3 {
    public static void main(String[] args) {
        System.out.println(function(5));
        System.out.println(function(6));
    }
    static int function(int a){
        int addition = 0;
        for (int i = 1; i < a; i++) {
            if ((a&i) == 0)
                addition += i;
        }
        return addition;
    }
}

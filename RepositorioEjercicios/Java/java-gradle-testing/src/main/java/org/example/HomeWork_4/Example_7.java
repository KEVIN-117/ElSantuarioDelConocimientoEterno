package org.example.HomeWork_4;

public class Example_7 {
    public static void main(String[] args) {
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(7));
    }
    static int fibonacci(int a){
        int addition = 0;
        int number_1 = 0;
        int number_2 = 1;
        for (int i = 0; i < a; i++) {
            number_1 = number_2;
            number_2 = addition;
            addition = number_1+number_2;
        }
        return addition;
    }
}

package org.example.HomeWork_4;

public class Example_6 {
    public static void main(String[] args) {
        System.out.println(counterDigit(317));
        System.out.println(counterDigit(248));
        System.out.println(counterDigit(3581));
    }
    static int counterDigit(int a ){
        int counter = 0;
        while (a != 0){
            int mod = a % 10;
            if (mod%2 == 0){
                counter++;
            }
            a /= 10;
        }
        return counter;
    }
}

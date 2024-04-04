package org.example.HomeWork_4;

public class Example_5 {
    public static void main(String[] args) {
        System.out.println(additionDigit(21));
        System.out.println(additionDigit(321));
        System.out.println(additionDigit(567));
        System.out.println(additionDigit(7784));
    }
    static int additionDigit(int a ){
        int additon = 0;
        while (a != 0){
            int mod = a%10;
            additon += mod;
            a /= 10;
        }
        return additon;
    }
}

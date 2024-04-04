package org.example.N_19CODESIGNAL.Introduccion;

public class EvenDigitsOnly {
    boolean solution(int n) {
        while (n != 0){
            if ((n%10) % 2 != 0){
                return false;
            }
            n = n/10;
        }
        return true;
    }

    public static void main(String[] args) {
        EvenDigitsOnly evenDigitsOnly = new EvenDigitsOnly();

        System.out.println(evenDigitsOnly.solution(248622));
        System.out.println(evenDigitsOnly.solution(642386));
    }
}

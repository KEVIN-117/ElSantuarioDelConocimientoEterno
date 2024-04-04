package org.example.N_23_CodeWars;

import java.util.Arrays;

public class ConverNumberToReverseArrayOfDigits {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        int number = 35231;
        System.out.println(Arrays.toString(digitize(number)));
    }
    public static int[] digitize1(long n){
        int[] list = new int[String.valueOf(n).length()];
        int index = 0;
        while (n != 0){
            list[index] = (int) (n%10);
            n = n/10;
            index++;
        }
        return list;
    }
    public static int[] digitize(int n){
        return new StringBuilder().append(n)
                .reverse().chars().map(Character::getNumericValue).toArray();
    }
}

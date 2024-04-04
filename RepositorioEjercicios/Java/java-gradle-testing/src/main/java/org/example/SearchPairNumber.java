package org.example;

public class SearchPairNumber {
    /*public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 7, 3, 7, 8, 3, 4, 4, 6, 5, 3};
        for (int i: numbers) {
            System.out.println(i + "  " + isPrime(i));
        }
    }*/
    public static boolean isPair(int number){
        if((number & 1) == 0){
            return true;
        }
        return  false;
    }
}

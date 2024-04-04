package org.example.ACM;

public class SearchNumberPair {
    public static void main(String[] args) {
        int[] casosDePrueba = {7, 10, 1031, 1000, -5, 0, 1, -1031, 5, 2147483647, 2147483};
        searchNumber(casosDePrueba);
    }

    public static void searchNumber(int[] numbers){
        for (int i: numbers) {
            if ((i & 1) == 0){
                System.out.println(i + " es par");
            }else {
                System.out.println(i + " no es par");
            }
        }
    }
}

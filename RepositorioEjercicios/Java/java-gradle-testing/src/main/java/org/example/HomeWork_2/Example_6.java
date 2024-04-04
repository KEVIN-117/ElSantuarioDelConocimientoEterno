package org.example.HomeWork_2;

import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int mayor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > mayor) {
                mayor = A[i];
            }
        }
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == mayor) {
                counter++;
            }
        }
        System.out.println("El numero mayor es: " + mayor +"\nse repite: " + counter);
    }
}

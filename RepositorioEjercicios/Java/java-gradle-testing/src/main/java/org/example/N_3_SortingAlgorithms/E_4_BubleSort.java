package org.example.N_3_SortingAlgorithms;

import java.util.Scanner;

public class E_4_BubleSort {
    public static void main(String[] args) {
        long Tinicio, Tfin;
        Scanner input = new Scanner(System.in);
        Tinicio = System.currentTimeMillis();
        //int[] A = {56, 34, 10, 77, 51, 93, 30, 5, 52, 4};
        int N = 1000000;
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random()*1000);
        }
        int counter = 0;
        for (int i = 0; i < A.length-1; i++) {
            for (int j = 0; j < A.length-1; j++) {
                if (A[j] > A[j+1]) {
                    int aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                }
                counter++;
            }
        }
        //System.out.println(counter);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        Tfin = System.currentTimeMillis();
        long tiempo = Tfin-Tinicio;
        System.out.println(tiempo);
    }
}

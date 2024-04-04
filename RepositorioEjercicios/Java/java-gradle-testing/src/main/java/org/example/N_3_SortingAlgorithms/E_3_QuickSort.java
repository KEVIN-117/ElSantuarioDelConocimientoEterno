package org.example.N_3_SortingAlgorithms;

import java.util.Scanner;

public class E_3_QuickSort {
    public static void main(String[] args) {
        long Tinicio, Tfin;
        Tinicio = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        int N = 1000000;//input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random()*1000);
        }

        System.out.println("\n--------------------------------------------------------------------------------------------------------");
        QuickSort(A, 0, A.length-1);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        Tfin = System.currentTimeMillis();
        System.out.println(Tfin-Tinicio);
    }
    static void QuickSort(int[] A, int inicio, int fin){
        int pivot = A[inicio];
        int i = inicio;
        int j = fin;
        while (i<j) {
            while (A[i] <= pivot & i<j)
                i++;
            while (A[j] > pivot)
                j--;
            if (i<j) {
                int aux = A[i];
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[inicio] = A[j];
        A[j] = pivot;
        if(j-1 > inicio)
            QuickSort(A, inicio, j-1);
        if(fin > j+1)
            QuickSort(A, j+1, fin);
    }
}

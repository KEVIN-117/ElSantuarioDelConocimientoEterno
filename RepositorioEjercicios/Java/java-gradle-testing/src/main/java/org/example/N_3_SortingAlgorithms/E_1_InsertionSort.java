package org.example.N_3_SortingAlgorithms;

public class E_1_InsertionSort {
    public static void main(String[] args) {
        System.out.println("INSERTION SORT");
        int[] A = {3,10,1,8,15,5,12,6,5,4};
        //int A[] = {56, 34, 10, 77, 51, 93, 30, 5, 52, 4};
        int counter = 0;
        int counterBreak = 0;
        int counterWhile=0;
        for (int i = 0; i < A.length-1; i++) {
            int j = i;
            while (j>=0) {
                if (A[j] < A[j+1]) {
                    counterBreak++;
                    break;
                }
                if (A[j+1] < A[j]) {
                    int aux = A[j];
                    A[j] = A[j+1];
                    A[j+1] = aux;
                    counter++;
                }
                j--;
                counterWhile++;
            }

        }
        System.out.println(counter);
        System.out.println(counterBreak);
        System.out.println(counterWhile);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }
}

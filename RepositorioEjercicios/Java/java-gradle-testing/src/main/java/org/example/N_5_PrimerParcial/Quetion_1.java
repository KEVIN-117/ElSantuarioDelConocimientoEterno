package org.example.N_5_PrimerParcial;

public class Quetion_1 {
    public static void main(String[] args) {
        int[] A = {3,6,2,7,3,5,1,8,4};
        int m = 0;
        int k=8;
        while (m<k) {
            if (A[m]>A[k])
                System.out.print(A[m] + " ");
            else
                System.out.print(A[k] + " ");
            m++;
            k--;
        }
    }
}

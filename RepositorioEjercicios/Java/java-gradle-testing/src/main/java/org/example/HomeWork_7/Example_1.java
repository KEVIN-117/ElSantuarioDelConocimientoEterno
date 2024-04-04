package org.example.HomeWork_7;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        serie(A, 1, 0, N);
    }
    static void serie (int[] A, int num, int nivel,int limite){
        A[nivel] = num;
        if (nivel== limite-1) {
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]);
            }
            System.out.println();
        }else{
            serie(A, num, nivel+1, limite);
            serie(A, num+1, nivel+1, limite);
        }
    }
}

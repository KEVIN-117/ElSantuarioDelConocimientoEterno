package org.example.HomeWork_2;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int ultimo = A[A.length-1];
        int counterGreater = 0;
        int counterMinor = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < ultimo) {
                counterMinor++;
            }else if(A[i] > ultimo){
                counterGreater++;
            }
        }
        System.out.print(counterGreater + " " + counterMinor);
    }
}

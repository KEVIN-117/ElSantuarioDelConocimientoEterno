package org.example.HomeWork_6;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        switch (N) {
            case 1:
                verSuma(2);
                break;
            case 2:
                fun(5, 0);
                break;
            case 3:
                int[] A = {1,2,3,4,5,6};
                mostrar(A, 0);
                break;
            case 4:
                int[] As = {5,9,4,7,2,6,3,1};
                dos(As, 0, 7);
                break;
            default:
                throw new AssertionError();
        }

        //


    }
    static void verSuma(int A){
        if(A<100){
            System.out.print(A + " ");
            verSuma(A+A);
        }

    }
    static void fun(int A, int nivel){
        if(nivel>2)
            return;
        else{
            fun(A-1, nivel+1);
            fun(A+1, nivel+1);
            System.out.print(A + " ");
        }
    }
    static void mostrar(int[] A, int posicion){
        if(posicion > 3)
            return;
        else{
            System.out.print(A[posicion] + " ");
            mostrar(A, posicion+2);
            mostrar(A, posicion+1);
        }
    }
    static void dos(int A[], int M, int P){
        if (M!= P) {
            int q = (M+P)/2;
            System.out.print(A[q] + " ");
            dos(A, M, q);
            dos(A, q+1, P);

        }
    }
}

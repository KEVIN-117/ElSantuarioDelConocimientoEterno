package org.example.N_4_EXAMPLES_RECURSIVE_FUNCTIONS;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println("FUNCIONES VOID RECURSIVOS");
        Scanner input = new Scanner(System.in);
        System.out.println("1.-Mostrar Numeros Anteriores.\n2.-Mostrar la Suma De un numero A hasta un numero B.\n3.-Recorrer un arbol"
                + "\n4.-Recorrer Una Matriz.\n5.-Recorrer Matriz");
        int N = input.nextInt();
        switch (N) {
            case 1:
                MostrarNumerosAnteriores(4);
                break;
            case 2:
                MostrarSumaDe_un_numero_A_a_un_numeroB(4, 8);
                break;
            case 3:
                serie(5, 0);
                break;
            case 4:
                int A[] = {3,7,9,4};
                recorrerMatrizIzquierda_a_Derecha(A, 3);
                break;
            case 5:
                int B[] ={3,9,7,5};
                recorrerMatriz(B, 0);
                break;
            default:
                throw new AssertionError();
        }

    }
    static void MostrarNumerosAnteriores(int A){
        System.out.print(A + " ");
        if(A!=1)
            MostrarNumerosAnteriores(A-1);
    }
    static void MostrarSumaDe_un_numero_A_a_un_numeroB(int A, int B){
        System.out.print(A + " ");
        if(A==B)
            return;
        else
            MostrarSumaDe_un_numero_A_a_un_numeroB(A+1, B);
    }
    static void serie(int A, int nivel){
        if(nivel > 2)
            return;
        else{
            System.out.print(A + " ");
            serie(A-1, nivel+1);
            serie(A+1, nivel+1);
        }
    }
    static void recorrerMatrizIzquierda_a_Derecha(int[] A, int tamaño){
        if(tamaño < 0)
            return;
        else{
            System.out.print(A[tamaño] + " ");
            recorrerMatrizIzquierda_a_Derecha(A, tamaño-1);
        }
    }
    static void recorrerMatriz(int[] A, int i){
        if(i>3)
            return;
        else{
            System.out.print(A[i] + " ");
            recorrerMatriz(A, i+1);
            recorrerMatriz(A, i+2);
        }
    }
}

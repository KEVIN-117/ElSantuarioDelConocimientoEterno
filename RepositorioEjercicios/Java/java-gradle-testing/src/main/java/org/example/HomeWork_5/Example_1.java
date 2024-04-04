package org.example.HomeWork_5;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ELIJA UNA OPCION:");
        System.out.println("1.-Multiplicar\n2.-Contar\n3.-Sumar Digitos\n4.-MCD\n5.-Sumar Arbol\n6.-Funcion\n7.-Digito Mayor\n");
        int N = input.nextInt();
        switch (N) {
            case 1:
                System.out.println(Multiplicar(1, 5));
                System.out.println(Multiplicar(3, 7));
                break;
            case 2:
                System.out.println(contar(2, 6));
                System.out.println(contar(1, 7));
                break;
            case 3:
                System.out.println(SumarDigitos(342));
                System.out.println(SumarDigitos(1056));
                break;
            case 4:
                System.out.println(MCD(3,24));
                System.out.println(MCD(3, 25));
                break;
            case 5:
                System.out.println(sumarArbol(3, 0));
                System.out.println(sumarArbol(7, 0));
                break;
            case 6:
                System.out.println(funcion(2, 6));
                System.out.println(funcion(6,2));
                break;
            case 7:
                System.out.println(DigitoMayor(2631));
                System.out.println(DigitoMayor(1573));
                break;
            default:
                throw new AssertionError();
        }
    }
    static int Multiplicar(int A, int B){
        if (B <= 0)
            return 1;
        else
            return A*Multiplicar(A, B-1);
    }
    static int contar(int A,  int B){
        if(A > B)
            return 0;
        else
            return (B-A)+contar(A+1, B);
    }
    static int SumarDigitos(int A){
        if(A == 0)
            return 0;
        else
            return (A%10)+SumarDigitos(A/10);
    }
    static int MCD(int M, int N){
        if(N==0)
            return M;
        else
            return MCD(N, M%N);
    }
    static int sumarArbol(int A, int C){
        if(C==3)
            return A;
        else
            return sumarArbol(A-1, C+1)+sumarArbol(A+1, C+1);
    }
    static int funcion(int N, int X){
        if (N==0)
            return X;
        else{
            if(N==1)
                return (2*X);
            else
                return 2*X*funcion(N-2, X);
        }
    }
    static int DigitoMayor(int A){
        if(A<10)
            return A;
        else{
            int x = DigitoMayor(A/10);
            if((A%10) > x)
                return (A%10);
            else
                return x;
        }
    }
}

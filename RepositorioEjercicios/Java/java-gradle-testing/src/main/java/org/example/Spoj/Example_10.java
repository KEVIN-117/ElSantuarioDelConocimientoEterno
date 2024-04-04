package org.example.Spoj;

import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int n=cin.nextInt();
        int []vector= new int[n];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=cin.nextInt();
        }
        quicksort(vector,0,vector.length-1);
        int cont = 0;
        int moda = 0;
        Colas a=new Colas(n+1);
        a.push(1);
        for (int i = 0; i < vector.length; i++) {
            int veces=0;
            for (int j = 0; j < vector.length; j++) {
                if (vector[i]==vector[j]) {
                    veces++;
                }
            }
            if (veces>cont) {
                a.pop();
                a.push(vector[i]);
                moda=vector[i];
                cont=veces;
            }
            if ((cont==veces && moda<vector[i])) {
                a.push(vector[i]);
                moda=vector[i];
            }
        }
        if (cont==1) {
            System.out.println(-1);
        }else{
            for (int i = 0; i < a.fin; i++) {
                if (a.frente()==0) {
                    a.pop();
                }else{
                    System.out.println(a.pop());
                }
            }
        }
    }
    public static void quicksort(int A[], int izq, int der)
    {

        int pivote=A[izq];
        int i=izq;
        int j=der;
        int aux;

        while(i<j){
            while(A[i]<=pivote && i<j) i++;
            while(A[j]>pivote) j--;
            if (i<j) {
                aux= A[i];
                A[i]=A[j];
                A[j]=aux;
            }
        }
        A[izq]=A[j];
        A[j]=pivote;
        if(izq<j-1)
            quicksort(A,izq,j-1);
        if(j+1 <der)
            quicksort(A,j+1,der);
    }
}
class Colas {
    int cola[];
    int inicio;
    int fin;
    public Colas(int n){
        cola=new int[n];
        inicio=0;
        fin=0;
    }
    public void push(int dato){
        cola[fin]=dato;
        fin++;
    }
    public int pop(){
        int aux=cola[inicio];
        inicio++;
        return aux;
    }
    public boolean full(){
        if(cola.length==fin)
            return true;
        return false;
    }
    public boolean empty(){
        if(inicio == fin)
            return true;
        return false;
    }
    public int frente(){
        return cola[inicio];
    }
}

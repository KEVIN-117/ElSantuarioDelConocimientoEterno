package org.example.N_6_Stacks;

public class Pila {
    int index;
    int tamaño;
    int[] A;

    public Pila(int index, int tamaño) {
        this.tamaño = tamaño;
        this.index = index;
        this.A = new int[tamaño];
    }
    void push(int x){
        A[index] = x;
        index++;
    }
    int pop(){
        index--;
        return A[index];
    }
    boolean isEmpty(){
        if (index==0)
            return true;
        else
            return false;
    }
}

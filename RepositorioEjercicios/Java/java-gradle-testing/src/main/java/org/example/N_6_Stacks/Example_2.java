package org.example.N_6_Stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author krodr
 * Realise un programa par insertar N numeros en una pila A posteriormente copie o pase los numeros pares
 * a una pila B y finlment muetre los datos de la pila B
 * Ejemplo:      Entrada               Salida
 *              5
 *              9 7 8 3 2               8 2
 */
public class Example_2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<Integer>();
        int N = x.nextInt();
        for (int i = 0; i < N; i++) {
            A.push(x.nextInt());
        }
        while (!A.isEmpty()) {
            if(A.peek()%2==0)
                B.push(A.pop());
            else
                A.pop();
        }
        while (!B.isEmpty()) {
            System.out.print(B.pop() + " ");
        }
    }
}


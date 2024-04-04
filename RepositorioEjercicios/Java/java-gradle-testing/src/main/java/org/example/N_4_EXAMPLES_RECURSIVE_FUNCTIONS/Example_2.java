package org.example.N_4_EXAMPLES_RECURSIVE_FUNCTIONS;

/**
 *
 * @author krodr
 * Escribe todas las combinaciones de ceros y unos para un n dado
 * Entrada:
 * la entrada en un numero n
 * Salida:
 * escribe todas las ocurrencias en orden lexicografico (mira el ejemplo) una por linea
 * entrada              Salida
 * 2                    00
 *                      01
 *                      10
 *                      11
 *
 * 3                    000
 *                      001
 *                      010
 *                      011
 *                      100
 *                      101
 *                      110
 *                      111
 *
 */
public class Example_2 {
    public static void main(String[] args) {
        int N = 2;
        int A[] = new int[N];
        funcion(A, 0, 0, N);
        funcion(A, 1, 0, N);
    }
    static void funcion(int A[], int numero, int nivel, int limite){
        A[nivel] = numero;
        if (nivel == limite-1) {
            for (int i = 0; i < limite; i++) {
                System.out.print(A[i]);
            }
            System.out.println();
        }
        else{
            funcion(A, 0, nivel+1, limite);
            funcion(A, 1, nivel+1, limite);
        }
    }
}


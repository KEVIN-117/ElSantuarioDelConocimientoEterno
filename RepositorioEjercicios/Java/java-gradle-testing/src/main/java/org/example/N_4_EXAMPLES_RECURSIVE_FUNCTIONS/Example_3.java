package org.example.N_4_EXAMPLES_RECURSIVE_FUNCTIONS;

/**
 * @author krodr
 * Roger quiere subir una escalera con N escalones y puede saltar ya sea: 1,2 o 3 ecalones a la vez. Debes
 * contar de cuantas maneras posibles roger puede lllegar al escalon N
 * Ejemplo:
 * Entrada                  Salida:
 * 3            -->         4
 * 4            -->         7
 */
public class Example_3 {
    public static void main(String[] args) {
        int N = 4;
        int total = subir(0, 1, N)+subir(0, 2, N)+subir(0, 3, N);
        System.out.println(total);
    }
    static int subir(int suma, int numero, int objetivo){
        int x = suma+numero;
        if(x==objetivo)
            return 1;
        else{
            if(x>objetivo)
                return 0;
            else
                return subir(x, 1, objetivo)+subir(x, 2, objetivo)+subir(x, 3, objetivo);
        }
    }
}

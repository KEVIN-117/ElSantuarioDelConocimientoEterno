package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;
/*
    Ratiorg recibió estatuas de diferentes tamaños como regalo de CodeMaster para su cumpleaños, cada estatua
    tenía un tamaño entero no negativo.
    Como le gusta hacer las cosas perfectas, quiere ordenarlas de menor a mayor para que cada estatua
    sea más grande que la anterior exactamente en 1. Es posible que necesite estatuas adicionales para
    poder lograrlo. Ayúdalo a calcular el número mínimo de estatuas adicionales necesarias.

    For statues = [6, 2, 3, 8], the output should be
    solution(statues) = 3.
    Ratiorg necsita statuas de tamaño 4, 5 y 7.
 */
public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = {0,3};
        System.out.println(fun(statues));
    }
    static int fun(int[] statues){
        Arrays.sort(statues);
        int counter = 0;
        int small = statues[0];
        for (int i = 0; i < statues.length; i++) {
            while (small != statues[i]){
                small++;
                counter++;
            }
            small++;
        }
        return  counter;
    }
}

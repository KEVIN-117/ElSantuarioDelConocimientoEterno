package org.example.N_25_ProyectEuler;

import java.util.ArrayList;

public class MultiplesOf_3_or_5 {
    public static void main(String[] args) {
        System.out.println(Multiples(1000));
    }

    /**
     *
     * @param n
     * @return <i>la suma de todos los múltiplos de 3 o 5 por debajo de <b>n</b>.</i>
     */
    public static int Multiples(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            list.add((i%5 ==0 || i%3==0)? i: 0);
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}

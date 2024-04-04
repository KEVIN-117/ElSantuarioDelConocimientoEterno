package org.example.N_25_ProyectEuler;

import java.util.ArrayList;

public class ExampleFile {
    public static void main(String[] args) {
        System.out.println(generateFibo());
    }

    /**
     * @return: <i>Al considerar los términos en la sucesión de Fibonacci cuyos valores no superan los cuatro millones,</i><h1>encuentre la suma de los términos de valor par</h1>.
     */
    public static int generateFibo(){
        ArrayList<Integer> acum = new ArrayList<>();
        int a = 0;
        int b =1;
        int suma = 0;
        while (true){
            a = b;
            b = suma;
            suma = a + b;
            if (suma < 4000000)
                acum.add(suma);
            else
                break;
        }
        return acum.stream().filter(item -> item%2==0).mapToInt(Integer::intValue).sum();
    }
}
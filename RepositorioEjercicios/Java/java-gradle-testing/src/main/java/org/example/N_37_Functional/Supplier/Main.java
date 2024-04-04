package org.example.N_37_Functional.Supplier;

import java.util.function.Supplier;

public class Main {
    /**
     * Usando Supplier:
     *
     * Crea una interfaz funcional Supplier que suministre un número aleatorio entre 1 y 100.
     * Utiliza esta interfaz para imprimir varios números aleatorios.
     * @param args
     */
    public static void main(String[] args) {
        Supplier<Integer> supplier = () ->(int) (Math.random()*1000)+1;

        getNumber(supplier,10);
    }

    static void getNumber(Supplier<Integer> task,Integer amount){

        if (amount > 0) {
            System.out.println(task.get());
            getNumber(task, amount-1);
        }
    }
}

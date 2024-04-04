package org.example.N_37_Functional.FunctionPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    /**
     * Usando Function y Predicate:
     *
     * Crea una lista de números enteros.
     * Utiliza la interfaz Predicate para filtrar los números pares.
     * Utiliza la interfaz Function para transformar los números filtrados (por ejemplo, multiplicarlos por 2) y guárdalos en otra lista.
     * Imprime la lista resultante.
     *
     * @param args
     */
    public static void main(String[] args) {

        Function<Integer, Integer> multiply = x -> x*3;
        Function<Integer, Integer> square = x -> x * x;
        ArrayData arrayData = new ArrayData();
        arrayData.fillData(15);

        arrayData.printData();
        arrayData.TransformData(multiply);

        arrayData.printData();
        arrayData.filterPairNumbers();

        arrayData.printData();
        arrayData.TransformData(square);

        arrayData.printData();
        arrayData.filterPairNumbers();
        
    }
}

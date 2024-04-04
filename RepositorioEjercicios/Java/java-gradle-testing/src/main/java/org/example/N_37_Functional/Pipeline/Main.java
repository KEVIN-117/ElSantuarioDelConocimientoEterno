package org.example.N_37_Functional.Pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java", "es", "divertido", "y", "poderoso");

        // Aplicar pipelining o composición de funciones con Streams
        List<String> resultado = palabras.stream()
                .filter(palabra -> palabra.length() > 3)       // Filtrar palabras con longitud mayor a 3
                .map(String::toUpperCase)                      // Convertir a mayúsculas
                .collect(Collectors.toList());                 // Recolectar los resultados en una lista

        // Imprimir el resultado
        System.out.println(resultado);
        Predicate<String> predicate = (x) -> x.length() > 3;
        Integer suma = palabras.stream()
                .filter(predicate)
                .mapToInt(String::length)
                .sum();
        System.out.println(suma);
    }
}

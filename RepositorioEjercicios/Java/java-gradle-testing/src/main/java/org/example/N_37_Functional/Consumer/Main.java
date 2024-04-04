package org.example.N_37_Functional.Consumer;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    /**
     * Usando Consumer:
     *
     * Crea una lista de cadenas.
     * Utiliza la interfaz Consumer para imprimir cada cadena en mayúsculas.
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "alumno", "maestro", "nuevo", "mayor"));

        Consumer<String> consumer = System.out::println;
        Consumer<String> transform = s -> System.out.println(s.toUpperCase() + " " + s.toLowerCase());
        list.forEach(consumer);
        list.forEach(transform);

    }
}

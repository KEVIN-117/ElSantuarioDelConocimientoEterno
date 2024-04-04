package org.example.N_24_ArraysStream;

import java.util.Arrays;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        String[] arr = { "Geeks", "for", "Geeks", "kevin", "alexis", "rodriguez", "condori" };

        Stream<String> stream = Arrays.stream(arr);
        Stream<String> streamRange = Arrays.stream(arr, 3, arr.length-2);

        System.out.println(stream.getClass().getSimpleName());
        stream.forEach(item -> System.out.println(item));
        streamRange.forEach(item -> System.out.println(item));
    }
}

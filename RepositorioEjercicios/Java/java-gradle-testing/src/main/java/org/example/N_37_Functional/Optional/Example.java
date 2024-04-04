package org.example.N_37_Functional.Optional;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        getNames(null)
                .ifPresentOrElse(System.out::println, () -> System.out.println("No names")
                );
    }

    static Optional<List<String>> getNames(List<String> names) {
        Optional<List<String>> optionalNames = Optional.ofNullable(names);

        return optionalNames;
    }
}

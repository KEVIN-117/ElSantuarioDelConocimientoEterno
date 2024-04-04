package org.example.N_37_Functional.ReferenceOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> courses = NameUtils.getList("Java", "JavaScript", "Python", "Kotlin", "Go", "Scala");
        Consumer<String> printer = x -> System.out.println(x);
        courses.forEach(printer);
        System.out.println("--------------------------------------------------");
        Consumer<String> printerReference = System.out::println;
        courses.forEach(printerReference);
        System.out.println("--------------------------------------------------");
        courses.forEach(System.out::println);
    }

    static class NameUtils{
        @SafeVarargs
        static <T> List<T> getList(T... elements) {
            return Arrays.asList(elements);
        }
    }

}

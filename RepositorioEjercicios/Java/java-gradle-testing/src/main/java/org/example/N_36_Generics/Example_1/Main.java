package org.example.N_36_Generics.Example_1;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, String> triFunction = new TriFunction<Integer, Integer, Integer, String>() {
            @Override
            public String apply(Integer integer, Integer integer2, Integer integer3) {
                return integer + " " + integer2 + " " + integer3 + " es igual a " + (integer + integer2 + integer3);
            }
        };

        TriFunction<Integer, Integer, Integer, String> triFunction2 = (x,y,z) -> x + " " + y + " " + z + " es igual a " + (x + y + z);


        System.out.println(triFunction.apply(1,2,3));
        System.out.println(triFunction2.apply(1,2,3));
        Function<Integer, Integer> function = x -> x * 2;
        Integer result = function.apply(2);
        System.out.println(function.getClass().getSimpleName());

    }
}

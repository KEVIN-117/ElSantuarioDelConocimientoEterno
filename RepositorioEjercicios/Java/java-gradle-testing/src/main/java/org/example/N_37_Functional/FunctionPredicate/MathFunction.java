package org.example.N_37_Functional.FunctionPredicate;

import java.util.function.Function;

public class MathFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(square.apply(5));


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

    }


}

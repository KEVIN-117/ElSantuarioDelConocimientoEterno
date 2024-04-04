package org.example.N_36_Generics.Example_2;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = Integer::sum;
        System.out.println(biFunction.apply(2,3));

        TriFunction<Integer, Integer, Integer, Integer> triFunction = (x,y,z) -> Integer.sum(x, Integer.sum(y,z));
        System.out.println(triFunction.apply(2,3,4));

        NFunction<Integer, Integer> nFunction = (x) -> Arrays.stream(x).reduce(0, Integer::sum);
        System.out.println(nFunction.apply(1,2,3,4,5,6,7,8,9,10));

        TriFunction<Integer, Integer, Integer, Integer> triFunction2 = (x,y,z) -> Integer.max(x, Integer.max(y,z));

        TriFuntionImpl funtion = new TriFuntionImpl();
        System.out.println(funtion.apply(1,2,3));;
    }
    /**
     * Represents a function that accepts three arguments and produces a result.
     *
     * @param <T> the type of the first argument to the function
     * @param <V> the type of the second argument to the function
     * @param <U> the type of the third argument to the function
     * @param <R> the type of the result of the function
     *
     */
    interface TriFunction<T, U, V, R> {
        /**
         * Applies this function to the given arguments.
         *
         * @param t the first function argument
         * @param v the second function argument
         * @param u the third function argument
         * @return the function result type U
         */
        R apply(T t, V v, U u);
    }
    /**
     * Represents a function that accepts a variable number of arguments and produces a result.
     *
     * @param <T> the type of the input to the function
     * @param <R> the type of the result of the function
     *
     */
    interface NFunction<T, R> {
        /**
         * Applies this function to the given arguments.
         *
         * @param t the n function argument
         * @return the function result type U
         */
        R apply(T ...t);
    }

    static class TriFuntionImpl implements TriFunction<Integer, Integer, Integer, String>{

        @Override
        public String apply(Integer integer, Integer integer2, Integer integer3) {
            return integer + " " + integer2 + " " + integer3 + " es igual a " + (integer + integer2 + integer3);
        }
    }

    class MyFunction <T, R>{


        Function<T, R> function;

        public MyFunction(Function<T, R> function) {
            this.function = function;
        }

        public R apply(T t){
            return function.apply(t);
        }
    }
}

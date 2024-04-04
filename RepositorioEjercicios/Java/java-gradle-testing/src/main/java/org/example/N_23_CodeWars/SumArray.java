package org.example.N_23_CodeWars;

import java.util.Arrays;

public class SumArray {

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
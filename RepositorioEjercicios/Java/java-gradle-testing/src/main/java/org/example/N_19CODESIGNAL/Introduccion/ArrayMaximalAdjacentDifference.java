package org.example.N_19CODESIGNAL.Introduccion;

public class ArrayMaximalAdjacentDifference {
    public int solution(int[] inputArray) {
        int result = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int aux = Math.abs(inputArray[i] - inputArray[i + 1]);
            result = Math.max(result, aux);
        }
        return result;
    }
}

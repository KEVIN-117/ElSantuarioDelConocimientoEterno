package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;

public class ArrayReplace {
    int[] solution(int[] inputArray, int elemToReplace, int substitutionElem) {
        return Arrays.stream(inputArray).map(item -> item == elemToReplace? substitutionElem : item).toArray();
    }

    public static void main(String[] args) {
        ArrayReplace arrayReplace = new ArrayReplace();

        System.out.println(Arrays.toString(arrayReplace.solution(new int[]{1, 2, 1}, 1, 3)));
    }
}

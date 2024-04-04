package org.example.N_19CODESIGNAL.Introduccion;

public class AdjacentElementsProduct {
    public static void main(String[] args) {
        int[] array = {-23, 4, -3, 8, -12};
        System.out.println(solution(array));
    }
    static int solution(int[] inputArray){
        int multiply = -800;
        //if (2 <= inputArray.length && inputArray.length <= 10){
            for (int i = 0; i < inputArray.length-1; i++) {
                if (multiply < inputArray[i]*inputArray[i+1]){
                    multiply = inputArray[i]*inputArray[i+1];
                }
            }
        //}
        return multiply;
    }
}

package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;

public class AllLongestStrings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"aba", "aa", "ad", "vcd", "aba"})));
    }
    static  String[] solution(String[] inputArray) {
        String saveElement = inputArray[0];
        int saveLength = inputArray[0].length();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > saveLength){
                saveLength = inputArray[i].length();
            }
        }
        int indexLimit = 1;
        String[] s = new String[indexLimit];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == saveLength) {
                s[indexLimit] = inputArray[i];
                indexLimit++;
            }
        }
        return s;
    }
}

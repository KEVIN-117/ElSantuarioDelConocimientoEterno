package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AreSimilar {
    public static boolean solution(int[] a, int[] b) {
        int counter = 0;
        int additionA = 1;
        int additionB = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                counter++;
            additionA *= a[i];
            additionB *= b[i];
        }
        return counter <= 2 && additionA == additionB;
    }




    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{1, 2, 3}, new int[]{2, 1, 3}));
        System.out.println(solution(new int[]{1, 2, 2}, new int[]{2, 1, 1}));
        System.out.println(solution(new int[]{1, 2, 1, 2}, new int[]{2, 2, 1, 1}));
        System.out.println(solution(new int[]{832, 998, 148, 570, 533, 561, 894, 147, 455, 279},
                                    new int[]{832, 570, 148, 998, 533, 561, 455, 147, 894, 279})
        );

    }

}

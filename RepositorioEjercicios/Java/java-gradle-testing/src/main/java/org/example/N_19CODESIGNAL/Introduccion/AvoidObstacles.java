package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;
import java.util.HashSet;

public class AvoidObstacles {
    int solution(int[] inputArray) {
        int j,max;
        HashSet<Integer> hashSet = new HashSet<>();
        max = 0;
        for (int i: inputArray) {
            max = Math.max(i, max);
            hashSet.add(i);
        }

        for (int i = 1; i <= max; i++) {
            for (j = i; j <= max; j += i) {
                if (hashSet.contains(j))
                    break;
            }
            if (j > max)
                return i;
        }
        return max+1;
    }

    public static void main(String[] args) {

    }
}

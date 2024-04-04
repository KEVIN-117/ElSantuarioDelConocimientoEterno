package org.example.N_19CODESIGNAL.Introduccion;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] seq = {1, 1, 2, 3, 4, 4};

        System.out.println(solution(seq));
    }
    static boolean solution(int[] sequence) {
        int numErr = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] - sequence[i+1] >= 0) {
                numErr += 1;
                if (i - 1 >= 0 && i + 2 <= sequence.length - 1
                        && sequence[i] - sequence[i+2] >= 0
                        && sequence[i-1] - sequence[i+1] >= 0) {
                    return false;
                }
            }
        }
        return numErr <= 1;
    }
}

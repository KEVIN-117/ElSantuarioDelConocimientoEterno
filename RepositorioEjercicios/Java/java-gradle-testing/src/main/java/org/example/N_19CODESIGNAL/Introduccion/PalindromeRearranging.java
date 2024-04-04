package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;
import java.util.Hashtable;

public class PalindromeRearranging {
    public static final int NO_CHARS = 50;
    public static boolean solution(String inputString) {
        int len = inputString.length();
        int[] count = new int[len];
        //Arrays.fill(count, 0);

        for (int i = 0; i < len; i++) {
            count[inputString.indexOf(inputString.charAt(i))]++;
        }

        int odd = 0;
        for (int i = 0; i < len; i++) {
            if ((count[i] & 1) == 1)
                odd++;
            if (odd > 1)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(solution("aabb"));
        System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
        System.out.println(solution("abbcabb"));
        System.out.println(solution("zyyzzzzz"));
        System.out.println(solution("z"));
        System.out.println(solution("zaa"));

        System.out.println(solution("abca"));
        System.out.println(solution("abcad"));
        System.out.println(solution("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"));
        System.out.println(solution("abdhuierf"));
    }
}

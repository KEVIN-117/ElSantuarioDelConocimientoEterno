package org.example.N_19CODESIGNAL.Introduccion;

import java.util.HashMap;

public class CommonCharacterCount {
    public static void main(String[] args) {
        System.out.println(CommonCharacterCount.solution("aabcc", "adcaa"));
        System.out.println(solution("zzzz", "zzzzzzz"));
    }

    static int solution(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            String c = "";
            int counter = 0;
            for (int j = 0; j < s1.length(); j++) {
                if (s1.charAt(i) == s1.charAt(j)){
                    c = String.valueOf(s1.charAt(j));
                    counter++;
                }
            }
            if (s2.contains(String.valueOf(s1.charAt(i)))){
                map.putIfAbsent(c, counter);
            }

        }
        for (int i = 0; i < s2.length(); i++) {
            String c = "";
            int counter = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(i) == s2.charAt(j)){
                    c = String.valueOf(s2.charAt(j));
                    counter++;
                }
            }
            if (s1.contains(String.valueOf(s2.charAt(i))) && map.get(c) != null && !(map.get(c) < counter)){
                map.replace(c, counter);
            }
        }
        int acumulator = 0;
        for (Integer value: map.values()) {
            acumulator += value;
        }
        return acumulator;
    }

}

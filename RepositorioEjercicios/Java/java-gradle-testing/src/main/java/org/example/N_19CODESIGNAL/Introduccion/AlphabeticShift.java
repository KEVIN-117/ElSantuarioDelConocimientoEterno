package org.example.N_19CODESIGNAL.Introduccion;

public class AlphabeticShift {
    String solution(String inputString) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toLowerCase().toCharArray();
        int displacement = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            char currentLetter = inputString.charAt(i);
            char letterDisplaced = alphabet[(currentLetter - 'a' + displacement) % 26];
            builder.append(letterDisplaced);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println((int)'b');
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println(3%26);
    }
}

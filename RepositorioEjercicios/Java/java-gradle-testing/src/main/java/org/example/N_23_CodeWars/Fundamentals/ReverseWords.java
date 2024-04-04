package org.example.N_23_CodeWars.Fundamentals;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(Kata.reverseWords2("The quick brown fox jumps over the lazy dog."));
        System.out.println(Kata.reverseWords2("     "));
    }
    public class Kata{
        public static String reverseWords(final String original) {
            String[] aux = original.split(" ");
            if (aux.length != 0){
                for (int i = 0; i < aux.length; i++) {
                    StringBuilder reverse = new StringBuilder(aux[i]);
                    aux[i] = String.valueOf(reverse.reverse());
                }
                // Have at it
                return String.join(" ", aux);
            }
            return original;
        }

        public static String reverseWords2(final String original)
        {
            return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                    .map(str -> new StringBuilder(str).reverse().toString())
                    .collect(Collectors.joining());
        }
    }
}

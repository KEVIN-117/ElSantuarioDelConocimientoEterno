package org.example.N_23_CodeWars;

public class SentenceSmash {
    public static void main(String[] args) {
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
    }
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result+" " +words[i];
        }
        return result.trim();
    }
    public static String smash2(String... words) {
        return String.join(" ", words);
    }
}

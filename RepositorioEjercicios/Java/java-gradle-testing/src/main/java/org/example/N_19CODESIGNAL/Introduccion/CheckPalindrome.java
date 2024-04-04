package org.example.N_19CODESIGNAL.Introduccion;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(fun("Eye"));
    }
    static boolean fun(String text){
        String[] save = text.toLowerCase().split("");
        String palindrome = "";
        for (int i = save.length-1; i>-1 ; i--) {
            palindrome += save[i];
        }
        return text.toLowerCase().equals(palindrome);
    }
}

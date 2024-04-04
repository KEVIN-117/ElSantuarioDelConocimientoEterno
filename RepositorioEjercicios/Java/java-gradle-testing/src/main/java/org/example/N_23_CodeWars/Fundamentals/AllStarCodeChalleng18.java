package org.example.N_23_CodeWars.Fundamentals;

public class AllStarCodeChalleng18 {
    public static void main(String[] args) {
        System.out.println(CodeWars.strCount("Hello", 'o'));
        System.out.println(CodeWars.strCount("Hello", 'l'));
        System.out.println( CodeWars.strCount("",'z'));
    }
    public class CodeWars {
        public static int strCount(String str, char letter) {
            //write code here
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == letter)
                    counter++;
            }
            return counter;
        }
        public static int strCount2(String str, char letter) {
            return (int)str.chars().filter(x -> x == letter).count();
        }
    }
}

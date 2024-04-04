package org.example.N_23_CodeWars.Fundamentals;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(Solution.removeExclamationMarks("Hello World!"));
    }
    class Solution {
        static String removeExclamationMarks(String s) {
            return String.join("",s.split("!"));
        }
        class Solution2 {
            static String removeExclamationMarks(String s) {
                return s.replaceAll("!", "");
            }
        }
    }
}

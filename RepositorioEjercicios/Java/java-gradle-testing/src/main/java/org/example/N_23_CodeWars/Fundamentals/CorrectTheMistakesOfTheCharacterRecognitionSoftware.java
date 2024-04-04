package org.example.N_23_CodeWars.Fundamentals;

public class CorrectTheMistakesOfTheCharacterRecognitionSoftware {
    public static void main(String[] args) {
        System.out.println(Correct.correct("1F-RUDYARD K1PL1NG"));
        System.out.println(Correct.correct("<...ND THE PRISONER OF A[zkaban]>"));

        System.out.println(Correct.correct("THE FEYNMAN LECTURE[5 ON PHY51C5]>"));
    }
    public class Correct {
        public static String correct(String string) {

            if (string.contains("1") || string.contains("5") || string.contains("0")){
                String[] aux = string.split("");
                for (int i = 0; i < aux.length; i++) {
                    if (aux[i].equals("5"))
                        aux[i] = "s";
                    else if (aux[i].equals("0"))
                        aux[i] = "o";
                    else if (aux[i].equals("1"))
                        aux[i] = "i";
                }
                return String.join("", aux).toUpperCase();
            }
            return string;
        }
    }

}

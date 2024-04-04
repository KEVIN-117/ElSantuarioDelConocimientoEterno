package org.example;

public class example {
    public static void main(String[] args) {
        /*String rojo = "\033[31m";
        String verde = "\033[32m";
        String naranja = "\033[33m";
        String azul = "\033[34m";
        String morado = "\033[35m";
        String celeste = "\033[36m";
        String blanco = "\033[37m";
        String pink = "\033[39m";


        System.out.println(morado+"kevibnasjansca");
        System.out.println(naranja + "\n Lunes\tMartes\tMiérc.\tJueves\tViernes");
        System.out.println(" ======\t=======\t======\t======\t=======");
        System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(verde + " PROG\tPROG\tPROG\tPROG" + rojo + "\tSIN");
        System.out.println(celeste + " ED" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + " FOL" + rojo + "\tSIN\tSIN" + blanco + "\tLM" + morado + "\tBDATO");
        System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");
        System.out.println(naranja + " FOL" + morado + "\tBDATO" + celeste + "\tED" + morado + "\tBDATO" + celeste + "\tED");*/
        //System.out.println(isPalindrome("Anita lava la tina"));

        for (int i = 0; i < 4; i++) {
            System.out.println(Math.random());
        }


    }

    public static boolean isPalindrome(String s){
        String revese = "";
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            revese += s.charAt(i);
        }
        revese = revese.replaceAll(" ", "").toLowerCase();
        System.out.println(revese);
        return revese.equals(s);
    }
}

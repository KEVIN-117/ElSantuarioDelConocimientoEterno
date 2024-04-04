package org.example.ExpresionesRegulares;

public class Example_3 {
    public static void main(String[] args) {
        String cad = "mj4M5hj85g]{{()";
        for (int i = 0; i < cad.length(); i++) {
            if(String.valueOf(cad.charAt(i)).matches("\\p{Lower}") || String.valueOf(cad.charAt(i)).matches("\\p{Upper}")){
                System.out.print(cad.charAt(i));
            }
        }
        System.out.println();
        for (int i = 0; i < cad.length(); i++) {
            if(String.valueOf(cad.charAt(i)).matches("\\p{Lower}") || String.valueOf(cad.charAt(i)).matches("\\p{Upper}")){
                System.out.print(String.valueOf(cad.charAt(i)));
            }
        }
    }
}

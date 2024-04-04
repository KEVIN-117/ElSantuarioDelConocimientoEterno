package org.example.ExpresionesRegulares;

public class Example_2 {
    public static void main(String[] args) {
        String cadena = "(4*5)/(4+6)";
        String[] A = cadena.split("");
        for (int i = 0; i < A.length; i++) {
            if (A[i].matches("[0-9]+")) {
                System.out.print( A[i] + " ");
            }
        }
    }
}

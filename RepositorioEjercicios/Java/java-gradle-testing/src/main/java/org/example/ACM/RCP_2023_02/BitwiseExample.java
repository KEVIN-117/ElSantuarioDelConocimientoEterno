package org.example.ACM.RCP_2023_02;

public class BitwiseExample {
    public static void main(String[] args) {
        // Verificar si un número es par o impar usando AND (&) con 1
        int num = 6;
        if ((num & 1) == 0) {
            System.out.println(num + " es un número par.");
        } else {
            System.out.println(num + " es un número impar.");
        }

        // Establecer el tercer bit en un número usando OR (|)
        int bitmask = 1 << 2;  // 0100
        int result = num | bitmask;
        System.out.println("Número después de establecer el tercer bit: " + result + " " + bitmask);

        // Borrar el segundo bit en un número usando AND (&) con NOT (~)
        bitmask = ~(1 << 1);  // 1011
        result = num & bitmask;
        System.out.println("Número después de borrar el segundo bit: " + result);

        // Cambiar el quinto bit en un número usando XOR (^)
        bitmask = 1 << 4;  // 10000
        result = num ^ bitmask;
        System.out.println("Número después de cambiar el quinto bit: " + result);

        // Cálculo de potencias de dos usando desplazamiento izquierdo (<<)
        int powerOfTwo = 1 << 3;  // 2^3 = 8
        System.out.println("2^3 es igual a: " + powerOfTwo);
    }
}


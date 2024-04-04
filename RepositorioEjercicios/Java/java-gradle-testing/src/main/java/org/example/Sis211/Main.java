package org.example.Sis211;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        System.out.println(bueltas(numero));
    }
    static String bueltas( int n ){
        return (n >= 10)? "Great, now move on to tricks" : "Keep at it until you get it";
    }
}

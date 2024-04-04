package org.example.Spoj;

import java.util.Scanner;

public class Example_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()){
            int n = input.nextInt();
            int suma = 0;
            for (int i = 1; i < n; i++) {
                if (n%i == 0){
                    suma += i;
                }
            }
            int aux = 0;
            for (int i = 1; i < suma ; i++) {
                if (suma % i == 0){
                    aux += i;
                }
            }
            System.out.println((aux == n)? suma:"-1");
        }
    }
}

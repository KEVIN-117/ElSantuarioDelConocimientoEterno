package org.example.Sis211;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        //primera forma
        int[] numeros = {1, 2, 5, 5};
        //segunda forma de declarra un vestor
        //int[] array = new int[10];
        //System.out.println(Arrays.toString(array));
        String[] strings = new String[10];
        //System.out.println(Arrays.toString(strings));

        //recorrer un array
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("ingrese el dato en el indice " + i);
            array[i] = scanner.nextInt();
        }
        //recorrer un vector
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

package org.example.Spoj;

import java.util.Scanner;

public class Example_6 {
    ///hash
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine().toUpperCase();
        while (true){
            if (word.equals("") || word.equals(" ")){
                break;
            }else {
                String[] arrayNumberElemnet = word.split(" ");
                int suma = 0;
                for (int i = 0; i < arrayNumberElemnet.length ; i++) {
                    for (int j = 0; j <arrayNumberElemnet[i].length() ; j++) {
                        suma += Math.abs(String.valueOf(arrayNumberElemnet[i].charAt(j)).compareTo("A"))+i+j;
                    }
                }
                System.out.println(suma);
                word = input.nextLine().toUpperCase();
            }
        }
    }
}

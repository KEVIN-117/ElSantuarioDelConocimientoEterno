package org.example.N_18TitanCode;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            String number = input.next();
            String[] array = number.split("");
            int index = 0;
            int endArray = array.length-1;
            int[] numberArray = new int[array.length];
            for (int j = 0; j < array.length-1 ; j++) {
                if (array[j+1].equals("0") && array[j] != "0"){
                    numberArray[index] = Integer.parseInt(array[j]+""+array[j+1]);
                    index++;
                }else {
                    numberArray[index] = Integer.parseInt(array[j]);
                    index++;
                }
                if(array[endArray] != "0"){
                    numberArray[index] = Integer.parseInt(array[endArray]);
                }
            }
            int suma = 0;
            int counter = 0;
            for (int j = 0; j < numberArray.length; j++) {
                suma += numberArray[j];
                if (numberArray[j] != 0){
                    counter++;
                }
            }
            System.out.println(suma/counter);

        }
    }
}

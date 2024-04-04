package org.example.N_18TitanCode;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int casos = input.nextInt();
            int[] array = new int[casos];
            for (int j = 0; j < casos; j++) {
                int number = input.nextInt();
                array[j] = number;
            }

            String printSting = "";
            for (int k = 0; k < array.length; k++) {
                int counter = 0;
                for (int m = 2; m < array[k] ; m++) {
                    if (array[k]%m == 0){
                        counter++;
                    }
                }
                if (counter == 0){
                    printSting += array[k] + ", ";
                }
            }
            if (printSting.length() > 3){
                for (int l = 0; l < printSting.length(); l++) {
                    if ( l <= 6){
                        System.out.print(printSting.charAt(l));
                    }
                }
            }else{
                System.out.println(printSting+"-1, -1");
            }
        }
    }
}

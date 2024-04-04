package org.example.N_16Examples_SIS_211;

import java.util.ArrayList;
import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int startNumber = input.nextInt();
            int finishNumber = input.nextInt();
            int saveNumber = 0;
            int saveCounter = 0;
            for (int j = startNumber; j <= finishNumber; j++) {
                int number = 0;
                int counter = 0;
                for (int k = 1; k <= j; k++) {
                    if (j%k == 0){
                        number = j;
                        counter++;
                    }
                }
                if (counter > saveCounter){
                    saveCounter = counter;
                    saveNumber = number;
                }
            }
            System.out.println("Between " + startNumber + " " + finishNumber +", " + saveNumber + " has a maximun of " + saveCounter + " divisors");

        }
    }
}

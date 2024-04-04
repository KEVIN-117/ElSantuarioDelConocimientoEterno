package org.example.Spoj;

import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        int n,startNumber,EndNumber, counter;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i < n; ++i) {
            startNumber = input.nextInt();
            EndNumber = input.nextInt();
            for (int j = startNumber; j <= EndNumber; ++j) {
                counter = 0;
                for (int k = 2; k < j; ++k) {
                    if (j%k == 0){
                        counter++;
                        break;
                    }
                }
                if (counter == 0){
                    System.out.println(j);
                }
            }
        }
    }
}

package org.example.Spoj;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        for (int i = 0; i < p; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            for (int j = n; j <= m; j++) {
                int counter = 0;
                for (int k = 2; k < j; k++) {
                    if (j%k == 0){
                        counter++;
                    }
                }
                if(counter == 0){
                    System.out.println(j);
                }
            }
        }
    }
}

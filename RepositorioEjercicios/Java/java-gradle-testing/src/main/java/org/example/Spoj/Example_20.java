package org.example.Spoj;

import java.util.Scanner;

public class Example_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int number = input.nextInt();
            int j = 1;
            int acum = 0;
            if (number> 4){
                while(number >= Math.pow(5,j)){
                    acum += number/Math.pow(5,j);
                    j++;
                }
            }
            System.out.println(acum);
        }
    }
}

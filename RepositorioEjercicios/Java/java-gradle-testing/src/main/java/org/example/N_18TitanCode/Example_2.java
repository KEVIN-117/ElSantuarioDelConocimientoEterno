package org.example.N_18TitanCode;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int luis = 0;
            int paco = 0;
            int hugo = 0;
            for (int j = 1; j <= 3 ; j++) {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                if (j == 1){
                    luis = number1+number2;
                }else if (j == 2) {
                    paco = number1+number2;
                } else if (j == 3) {
                    hugo = number1+number2;
                }
            }
            if (paco < luis && hugo < luis){
                System.out.println("Luis");
            } else if (luis < paco && hugo < paco) {
                System.out.println("Paco");
            } else if (luis < hugo && paco < hugo) {
                System.out.println("Hugo");
            }else {
                System.out.println("NADIE");
            }
        }
    }

}

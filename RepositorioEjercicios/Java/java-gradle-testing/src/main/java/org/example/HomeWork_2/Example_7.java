package org.example.HomeWork_2;

import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int N = input.nextInt();
        int[] A=new int[N];
        for(int i = 0; i < N; i++){
            A[i]= input.nextInt();
        }

        int numberRepeat = 0;
        int counterNumberRepeat = 0;
        for(int j = 0; j < N; j++){
            int counter = 0;
            int auxiliary = A[j];
            for(int k = 0; k < N; k++)
                if(A[k] == auxiliary)
                    counter++;
            if(counter > counterNumberRepeat){
                numberRepeat = auxiliary;
                counterNumberRepeat = counter;
            }
        }
        System.out.println(numberRepeat);
    }
}

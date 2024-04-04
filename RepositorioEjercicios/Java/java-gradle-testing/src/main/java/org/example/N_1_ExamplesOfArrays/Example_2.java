package org.example.N_1_ExamplesOfArrays;
import java.util.Scanner;
public class Example_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0){
                //System.out.print(A[i] + " ");
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);
    }
}

package org.example.N_1_ExamplesOfArrays;

import java.util.Scanner;
/**Realice un programa para insertar N números en un vector,
 * posteriormente muestre el número par más grande
 */
public class TrainingPractice_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int evenNumberBig = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                if (A[i] > evenNumberBig) {
                    evenNumberBig = A[i];
                }
            }
        }
        System.out.println(evenNumberBig);
    }
}

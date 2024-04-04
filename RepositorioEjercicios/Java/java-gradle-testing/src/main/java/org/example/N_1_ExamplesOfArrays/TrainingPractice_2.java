package org.example.N_1_ExamplesOfArrays;

import java.util.Scanner;
/**Realice un programa para insertar N números en un vector, posteriormente
 * visualice cuántos son malos, cuántos son buenos y cuántos son excelentes.
 * Es malo cuando es menor que 10, es bueno cuando esta entre 10 y 20, y es
 * excelente cuando es más que 20.
 */
public class TrainingPractice_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }
        int counterBadNumbers = 0;
        int counterGoodNumbers = 0;
        int counterExcellentNumbers = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < 10) {
                counterBadNumbers++;
            }else if(A[i] >= 10 && A[i] <= 20){
                counterGoodNumbers++;
            }else if(A[i] > 20){
                counterExcellentNumbers++;
            }
        }
        System.out.println("the Bad Numbers are :" + counterBadNumbers);
        System.out.println("the Good Numbers are :" + counterGoodNumbers);
        System.out.println("the Excellent Numbers are :" + counterExcellentNumbers);
    }
}

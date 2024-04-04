package org.example.Spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Example_24 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = x.nextInt();
        }
        int number = x.nextInt();
        int indexNumber = Arrays.binarySearch(array, number);
        if (indexNumber-1 > 0 && indexNumber+1 < array.length){
            if (isPrime(array[indexNumber-1]) && isPrime(array[indexNumber+1])){
                System.out.println("Yes");
            }
        }
        else {
            System.out.println("No");
        }
    }
    static boolean isPrime(int n){
        int counter = 0;
        for (int i = 2; i <n ; i++) {
            if (n%i == 0){
                counter++;
                break;
            }
        }
        if (counter == 0)
            return true;
        return false;
    }
}

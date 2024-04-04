package org.example.Spoj;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Example_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }
        int search = input.nextInt();
        BigInteger bigInteger = BigInteger.valueOf(search);
        System.out.println(Arrays.binarySearch(array,search));

        System.out.println(array[Arrays.binarySearch(array,search)]-1);
        System.out.println(Arrays.binarySearch(array,search));
        if(bigInteger.isProbablePrime(array[Arrays.binarySearch(array,search)]-1) &&
                bigInteger.isProbablePrime(array[Arrays.binarySearch(array,search)]+1)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}

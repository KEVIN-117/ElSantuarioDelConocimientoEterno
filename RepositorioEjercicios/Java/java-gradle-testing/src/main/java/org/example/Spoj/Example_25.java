package org.example.Spoj;

import java.util.Arrays;
import java.util.Scanner;

public class Example_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String[] sep = word.split("\\p{Punct}+");
        System.out.println(Arrays.toString(sep));
    }
}

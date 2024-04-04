package org.example.Spoj.AI_G;

import java.util.Scanner;

public class Nombres_Geniales {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int name = input.next().length();
        System.out.println((name%2==0)?"Es Genial":"No es Genial");
    }
}

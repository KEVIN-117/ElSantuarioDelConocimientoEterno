package org.example.N_32_SphereOnlineJudge;


import java.util.Scanner;

public class AggressiveCows {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        int N, C, a, y;

        a = 0;
        y = 0;
        while (n >= 1){
            N = x.nextInt();
            C = x.nextInt();
            y = N+C;
            while ( N >= 1){
                a += x.nextInt();
                N -= 1;
            }
            n -= 1;
        }
        System.out.println(a/y);
    }
}
/*
NoSuchElementException
 */

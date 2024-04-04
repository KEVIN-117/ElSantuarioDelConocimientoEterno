package org.example.ACM.RCP_2023_26;

import java.util.Scanner;

public class Jampacked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            long minJars = (long) (n /((n+k-1)/ k));
            System.out.println(minJars);
        }
    }
}

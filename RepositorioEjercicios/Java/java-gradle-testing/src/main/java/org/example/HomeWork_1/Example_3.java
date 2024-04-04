package org.example.HomeWork_1;
import  java.util.Scanner;
public class Example_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int num_1=0;
        int num_2=1;
        int sum = 0 ;
        for(int i=1; i<=number; ++i) {
            num_1 = num_2;
            num_2=sum;
            sum = num_1 + num_2;
            System.out.print(sum +" ");
        }
    }
}

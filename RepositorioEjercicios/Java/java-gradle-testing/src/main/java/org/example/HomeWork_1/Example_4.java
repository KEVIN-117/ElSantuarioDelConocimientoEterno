package org.example.HomeWork_1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Example_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double y = (Math.pow((1-x), 5))/Math.sqrt(x);
        DecimalFormat format = new DecimalFormat("#.###");
        System.out.println(format.format(y));
    }
}

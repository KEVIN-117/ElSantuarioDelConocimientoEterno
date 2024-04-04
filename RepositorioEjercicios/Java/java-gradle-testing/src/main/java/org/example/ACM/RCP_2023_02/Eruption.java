package org.example.ACM.RCP_2023_02;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Eruption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat format = new DecimalFormat("#.#########");
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(format.format(2*Math.PI*(Math.sqrt(n/Math.PI))));
        }
    }
}

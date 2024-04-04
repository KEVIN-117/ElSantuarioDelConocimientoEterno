package org.example.ACM.Contest_588310;

import java.util.Scanner;

public class D_QualB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();

        String c = s.next().substring(0, n);
        int i = 0;
        int counter = 1;
        StringBuilder builder = new StringBuilder();
        while (i < c.length() && counter <= k){
            if (c.charAt(i) == 'o'){
                counter++;
            }
            builder.append(c.charAt(i));
            i++;
        }
        String aux = c.substring(i).replace("o", "x");
        System.out.println(builder.toString().concat(aux));
    }
}

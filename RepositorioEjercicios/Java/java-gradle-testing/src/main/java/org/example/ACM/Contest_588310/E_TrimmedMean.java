package org.example.ACM.Contest_588310;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Arrays;
import java.util.Scanner;

public class E_TrimmedMean {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int n = x.nextInt();
        int len = 5*n;
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = x.nextInt();
        }
        Arrays.sort(a);
        double sum = 0;
        for (int i = n; i < len-n; i++) {
            sum += a[i];
        }
        DecimalFormat format = new DecimalFormat("0.000000000000000");
        System.out.println(format.format(sum/(3*n)));
    }
}
//33,33333333333334
//33.333333333333336
//5.500000000000000
//5,500000000000000

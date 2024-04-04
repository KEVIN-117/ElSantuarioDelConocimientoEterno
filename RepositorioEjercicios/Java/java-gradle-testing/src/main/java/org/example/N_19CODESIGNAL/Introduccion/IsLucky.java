package org.example.N_19CODESIGNAL.Introduccion;

import java.util.Arrays;

public class IsLucky {
    public static void main(String[] args) {
        solution(1230);
    }

    static boolean solution(int n) {
        int i,j;
        i = 0;
        j = String.valueOf(n).length()-1;
        String[] strings = String.valueOf(n).split("");
        System.out.println(Arrays.toString(strings));
        int acum2 = 0;
        while (i != strings.length/2 && j != strings.length/2){
            n += Integer.parseInt(strings[i]);
            acum2 += Integer.parseInt(strings[j]);
            i++;
            j--;
        }
        System.out.println(n);
        //System.out.println(acum2);
        return true;
    }
}

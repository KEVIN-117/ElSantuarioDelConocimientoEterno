package org.example.N_19CODESIGNAL.Introduccion;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(solution(1905));
        System.out.println(solution(1700));
    }
    static int solution(int year){
        Double y = (double) year/100;
        String[] convertY = String.valueOf(y).split("\\p{Punct}");
        return (Integer.parseInt(convertY[1]) == 0)? Integer.parseInt(convertY[0]): Integer.parseInt(convertY[0])+1;

    }
}

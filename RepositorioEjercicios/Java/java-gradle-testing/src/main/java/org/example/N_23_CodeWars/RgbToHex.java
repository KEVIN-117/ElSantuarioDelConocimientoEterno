package org.example.N_23_CodeWars;

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return convertToHex(r)+convertToHex(g)+convertToHex(b);
    }

    public static String convertToHex(int number){

        //return String.format("%03d", Integer.toHexString(number)).toUpperCase();
        if (number < 10 && number >= 0)
            return String.format("%02d", number);
        else if (number < 0)
            return String.format("%02d", 0);
        else if (number > 255)
            return Integer.toHexString(255).toUpperCase();
        return Integer.toHexString(number).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
        System.out.println(rgb(1,2,3));
        System.out.println(rgb(10,10,10));
        System.out.println(rgb(0,0,0));
        System.out.println(rgb(148, 0, 211));
    }
}
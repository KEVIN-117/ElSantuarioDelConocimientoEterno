package org.example.N_23_CodeWars;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(century(2000));
        System.out.println(century2(2000));
    }
    public static int century(int number) {
        // your code goes here

        Double save = (double)(number)/100;
        String[] array = String.valueOf(save).split("\\p{Punct}");
        if (Integer.parseInt(array[1]) != 0){
            number = Integer.parseInt(array[0])+1;
        }else {
            number = Integer.parseInt(array[0]);
        }
        return number;
    }
    public static int century2(int number) {
        return (number + 99) / 100;
    }
}

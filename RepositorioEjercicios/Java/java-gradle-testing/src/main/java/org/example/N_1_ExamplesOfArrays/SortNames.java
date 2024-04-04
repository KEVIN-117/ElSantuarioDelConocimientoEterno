package org.example.N_1_ExamplesOfArrays;

import java.util.Arrays;

public class SortNames {
    public static void main(String[] args) {
        String[] namesList = {"Liam","Olivia","Noah", "Emma","Oliver","Charlotte","Elijah", "Amelia","James","Ava","William","Sophia","Benjamin", "Isabella","Lucas","Mia","Henry","Evelyn","Theodore","Harper"};
        for (int i = 0; i < namesList.length; i++) {
            System.out.print(namesList[i] + ", ");
        }
        Arrays.sort(namesList);
        System.out.println();
        for (int i = 0; i < namesList.length; i++) {
            System.out.print(namesList[i] + ", ");
        }
        String name = "kevin";
        System.out.println(name);
    }
}

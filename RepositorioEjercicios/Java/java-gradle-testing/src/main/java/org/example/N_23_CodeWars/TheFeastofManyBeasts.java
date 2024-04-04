package org.example.N_23_CodeWars;

public class TheFeastofManyBeasts {
    public static void main(String[] args) {
        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("brown bear","bear claw"));
    }
    public static boolean feast(String beast, String dish) {

        return (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1));

    }
}

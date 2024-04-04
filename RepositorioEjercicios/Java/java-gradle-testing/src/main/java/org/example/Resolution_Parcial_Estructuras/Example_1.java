package org.example.Resolution_Parcial_Estructuras;

import java.util.*;

/**
 * @authors <b><i><ol><li>Kevin Alexis Rodriguez Condori</li></ol></i></b>
 */
public class Example_1 {
    public static String rojo = "\033[31m";
    public static String verde = "\033[32m";
    public static String morado = "\033[35m";
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23,5,67,3,25,1,6,7,9,0);
        //list.sort(Comparator.naturalOrder());
        //list.forEach(System.out::println);
        //System.out.println(list.isEmpty());


        list.forEach(item ->{
            System.out.println( (item%5==0 || item%3==0)? morado+item : rojo+item);
        });
        HashMap<String, HashMap<String, ArrayList<Integer>>> addDatas = new HashMap<>();
    }
}

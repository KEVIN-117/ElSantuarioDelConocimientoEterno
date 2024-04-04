package org.example.ExpresionesRegulares;

import java.util.ArrayList;
import java.util.HashMap;

public class Example_1 {
    public static void main(String[] args) {
        /*String[] palabras = {"kevin117", "(157[]Aleis)", "Ro123driguez"};
        for (int i = 0; i < palabras.length; i++) {
            if (String.valueOf(palabras[i]).contains("\\p{Lower}\\p{Upper}\\d")){
                System.out.println(palabras[i]);
            }
        }*/
        Integer param = 10;
        setValue(param);
        System.out.println(param);
        HashMap<String, ArrayList<Integer>> h = new HashMap<>();
    }
    public static void setValue(Integer value){
        value = -1;
    }
}

class hilo implements Runnable{

    @Override
    public void run() {

    }
}

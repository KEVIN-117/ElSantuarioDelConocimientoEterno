package org.example.N_37_Functional.Streams;

import org.example.N_28_POO.GuiStudents.components.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Juan","Pedro","Luis","Maria","Ana","Jose","Carlos","Rosa","Luisa","Marta"));

        data.stream()
                .filter(x -> x%2 == 0)
                .map(x -> x*x)
                .forEach(System.out::println);
    }
}

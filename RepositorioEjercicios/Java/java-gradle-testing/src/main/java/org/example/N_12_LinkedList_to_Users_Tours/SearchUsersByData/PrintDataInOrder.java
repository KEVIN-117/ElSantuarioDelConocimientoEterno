package org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData;

import org.example.N_12_LinkedList_to_Users_Tours.Node;

import java.util.Arrays;

public class PrintDataInOrder {
    public static void sortData(Node aux, Node header, int N){
        String[] names = new String[N];
        int index = 0;
        while (aux!= null){
            names[index] = String.valueOf(aux.Data.getName());
            index++;
            aux = aux.linked;
        }
        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            Node auxPrint = header;
            while (auxPrint != null){
                if (auxPrint.Data.getName().equals(names[i])){
                    System.out.println(auxPrint.Data.printData());
                }
                auxPrint = auxPrint.linked;
            }
        }
    }
}

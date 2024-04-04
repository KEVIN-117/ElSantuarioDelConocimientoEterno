
package org.example.N_11_Linked_Lists.CLass_1;

import java.util.Scanner;

public class Example_2 {
    /*
        Realice un programa para incertar n nucos en una lista enlazada y luego muestre los datos pares de la lista
          Ejemplo:
            Entrada:                 Salida:
                4
                7 6 8 2                 8 2 6 7
     */
    static Node header;
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        header = null;
        int N = x.nextInt();
        for (int i = 0; i < N; i++){
            if (header == null){
                header = new Node(x.nextInt());
            }else {
                Node temp = new Node(x.nextInt());
                temp.linked = header;
                header = temp;
            }
        }
        Node auxiliary = header;
        while (auxiliary != null){
            System.out.print(auxiliary.Data + " ");
            auxiliary = auxiliary.linked;
        }
        System.out.println();
        removeData(x.nextInt());
        while (auxiliary != null){
            System.out.print(auxiliary.Data + " ");
            auxiliary = auxiliary.linked;
        }
    }
    static void removeData (int dataRemove){
        Node aux = header;
        while(dataRemove != aux.Data){
            if (dataRemove == aux.Data){
                header.linked = header.linked.linked;
                break;
            }
        }
    }

}
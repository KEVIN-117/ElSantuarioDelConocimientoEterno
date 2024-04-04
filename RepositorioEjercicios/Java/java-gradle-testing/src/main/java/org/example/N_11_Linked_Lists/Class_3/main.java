package org.example.N_11_Linked_Lists.Class_3;

import java.util.Scanner;

public class main {
    public static void main(String[] args)throws Exception{
        Scanner input = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        linkedList.loadData();
        while (true){
            System.out.println("\n<-------->MENU<----------->");
            System.out.println("1.-Insertar Datos\n2.-Mostrar Datos\n3.-Salir del programa");
            int option = input.nextInt();
            if(option == 1){
                linkedList.addData(input.nextInt());
            }
            if(option == 2){
                linkedList.showData();
            }
            if(option == 3){
                linkedList.saveDataFile();
                break;
            }

        }
    }
}

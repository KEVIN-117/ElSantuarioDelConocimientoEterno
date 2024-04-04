package org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData;

import org.example.N_12_LinkedList_to_Users_Tours.Node;
import org.example.N_12_LinkedList_to_Users_Tours.Users;

/**
 * @author krodr
 * @version 1.0.0
 * @Definicion: Busca a los ususarios por edad
 * @Funtions:
 * <h3>
 *     <i>printAllUsersInAnAgeRange()</i>
 * </h3>
 */
public class printUserByAge {
    /**
     *@Definicion: Esta funcion recive 3 parametros la lista enlasada un rango minimo de edad y el maximo
     *@imprime: todos los usuarios con la edad en el rango establcido
     * @param header
     * @param rangeMinimun
     * @param rangeMaximun
     */
    public static void printAllUsersInAnAgeRange(Node header, int rangeMinimun, int rangeMaximun){

        Node aux = header;
        while (aux != null){
            if (aux.Data.getAge() >= rangeMinimun && aux.Data.getAge() <= rangeMaximun){
                System.out.println(aux.Data.printData());
            }
            aux = aux.linked;
        }

    }

    /**
     *@Definicion: imprime el usuario con edad mayor a todos los demas usuarios
     * @Method printSeniorUser
     * @param aux
     */
    public static void printSeniorUser(Node aux){
        int bigerAge = 0;
        Users seniorUser = null;
        while (aux != null){
            if (aux.Data.getAge() > bigerAge){
                bigerAge = aux.Data.getAge();
                seniorUser = aux.Data;
            }
            aux = aux.linked;
        }
        System.out.println(seniorUser.printData() + " ");
    }

    /**
     * @Definicion: imprime el usuario con edad menor a todos los demas usuarios
     * @Method printMinorUser
     * @param aux
     */
    public static void printMinorUser(Node aux){
        int smallerAge = 500;
        Users minorUser = null;
        while (aux != null){
            if (aux.Data.getAge() < smallerAge){
                smallerAge = aux.Data.getAge();
                minorUser = aux.Data;
            }
            aux = aux.linked;
        }
        System.out.println(minorUser.printData() + " ");
    }
}

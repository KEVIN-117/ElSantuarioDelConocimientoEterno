package org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData;

import org.example.N_12_LinkedList_to_Users_Tours.Node;
/**
 *@author krodr
 *@version 1.0.0
 *@Funtions:
 *      <p><i>printEverybodyUsers(..)</i></p>
 *      <p><i>printUser(..)</i></p>
 */
public class SearchUserByName {
    /**
     * @Definicion: Busca a todos los usuarios con el nombre dado <h3><i>nameUser</i></h3>
     * @return todos los ususarios con el nombre <h3><i>nameUser</i></h3>
     * @param header
     * @param nameUser
     */
    public static void printEverybodyUsers(Node header, String nameUser){
        Node aux = header;
        while(aux!= null){
            if (aux.Data.getName().equals(nameUser)){
                System.out.println(aux.Data.printData());
                continue;
            }
            aux = aux.linked;
        }
    }

    /**
     *@Definicion: Busca a todos los usuarios con el nombre y apellido  dado <h3><i>nameUser</i></h3> <h3><i>lastName</i></h3>
     * @return todos los ususarios con el nombre y apellido <h3><i>nameUser</i></h3> <h3><i>lastName</i></h3>
     * @param header
     * @param nameUser
     * @param lastName
     */
    public static void printUser(Node header, String nameUser, String lastName){
        Node aux = header;
        while(aux!= null){
            if (aux.Data.getName().equals(nameUser) && aux.Data.getLastName().equals(lastName)){
                System.out.println(aux.Data.printData());
                break;
            }
            aux = aux.linked;
        }
    }
}

package org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData;

import org.example.N_12_LinkedList_to_Users_Tours.FontsColor;
import org.example.N_12_LinkedList_to_Users_Tours.Node;

/**
 * @author krodr
 * @version 1.0.0
 * @Definicion: <p>Busca a los ususario por su ID codigo</p>
 * @Funtions:
 * <h3>
 *    <i>SearchId()</i>
 * </h3>
 */
public class SearchUserById {
    /**
     * @Definicion: Resive dos parametros La lista enlasada y el id del usuario
     * @print EL ususario con el id buscado
     * @param header
     * @param idUser
     */
    public static void SearchId(Node header, int idUser){
        Node aux = header;
        System.out.println(FontsColor.naranja +"Enter the id search");
        //int index = 1;
        while(aux!= null){
            if (aux.Data.getId() == idUser){
                System.out.println(aux.Data.printData());
                break;
            }
            aux = aux.linked;
        }
    }
}

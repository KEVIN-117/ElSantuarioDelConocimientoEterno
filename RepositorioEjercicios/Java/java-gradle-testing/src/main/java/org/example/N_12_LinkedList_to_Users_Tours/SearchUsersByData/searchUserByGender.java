package org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData;

import org.example.N_12_LinkedList_to_Users_Tours.FontsColor;
import org.example.N_12_LinkedList_to_Users_Tours.Node;

public class searchUserByGender {
    public static void searchUserFemale(Node auxGenderFemale){
        while (auxGenderFemale != null){
            //System.out.println(auxGender.Data.getGender() );
            if (auxGenderFemale.Data.getGender().equals(FontsColor.morado+"FEMALE")){
                System.out.println(auxGenderFemale.Data.printData());
            }
            auxGenderFemale = auxGenderFemale.linked;
        }
        //auxGender = header;
    }
    public static void searchUserMale(Node auxGenderMale){
        while (auxGenderMale != null){
            //System.out.println(auxGender.Data.getGender());
            if (auxGenderMale.Data.getGender().equals(FontsColor.azul+"MALE")){
                System.out.println(auxGenderMale.Data.printData());
            }
            auxGenderMale = auxGenderMale.linked;
        }
        //auxGender = header;
    }
}

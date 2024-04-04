package org.example.N_12_LinkedList_to_Users_Tours.Menu;

import org.example.N_12_LinkedList_to_Users_Tours.FontsColor;

/**
 * @author krodr
 * @version 1.0.0
 * @Methods: menuDatas()
 *           menuDataOfender()
 *
 */
public class MenuOptions {

    public static void menuDatas(){
        System.out.println(FontsColor.naranja+">>Please Choose a optyon<<".toUpperCase());
        System.out.println(FontsColor.naranja+"\n1.-Add new User" +
                           FontsColor.naranja+"\n2.-Print everybody datas" +
                           FontsColor.naranja+"\n3.-Print the data of the user by age"+
                           FontsColor.naranja+"\n4.-Print data for Gender"+
                           FontsColor.naranja+"\n5.-Print data in alphabetical order"+
                           FontsColor.naranja+"\n0.-Exit The Program");
    }
    public static void  menuDataOfgender(){
        System.out.println(FontsColor.celeste+">>Please Choose a optyon gender<<".toUpperCase());
        System.out.println(FontsColor.celeste+"\n1.-Print data to gender Female" +
                           FontsColor.celeste+"\n2.-Print data to gender Male" +
                           FontsColor.rojo+"\n0.-Exit the menu print data of gender");
    }

    public static void menuDataOfAge(){
        System.out.println(FontsColor.morado+">>Please Choose a optyon gender<<".toUpperCase());
        System.out.println(FontsColor.morado+"\n1.-Print Senior user" +
                           FontsColor.morado+"\n2.-Print Minor User" +
                           FontsColor.morado+"\n3.-Print user age in the range specified" +
                           FontsColor.rojo+"\n0.-Exit the menu print data of age");
    }


    public static void menuDataNames(){
        System.out.println(FontsColor.azul+">>Please Choose a optyon gender<<".toUpperCase());
        System.out.println(FontsColor.azul+"\n1.-Print all users with the specified name" +
                           FontsColor.azul+"\n2.-Print all users with the specified name and last name" +
                           FontsColor.rojo+"\n0.-Exit the menu print data names ");
    }
}

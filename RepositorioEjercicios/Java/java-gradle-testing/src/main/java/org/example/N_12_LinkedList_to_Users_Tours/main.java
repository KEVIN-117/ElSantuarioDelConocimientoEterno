package org.example.N_12_LinkedList_to_Users_Tours;

import org.example.N_12_LinkedList_to_Users_Tours.Menu.MenuOptions;
import org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData.SearchUserByName;
import org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData.printUserByAge;
import org.example.N_12_LinkedList_to_Users_Tours.SearchUsersByData.searchUserByGender;

import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Node header = null;
        boolean isTrue = true;
        while (isTrue){
            MenuOptions.menuDatas();
            int caso = input.nextInt();
            Node aux = header;
            switch (caso){
                case 1:{
                    System.out.println("Enter your data in the next order: gender id  name lastName birthDay job");
                    if (header == null){
                            header = new Node(new Users(input.next().toUpperCase(), input.nextInt(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase()));
                        }else{
                            Node temp = new Node(new Users(input.next().toUpperCase(), input.nextInt(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase()));
                            temp.linked = header;
                            header = temp;
                        }
                    break;
                }
                case 0:{
                    System.out.println(FontsColor.azul+"The process is over. Thank you for using our services. :)");
                    isTrue = false;
                    break;
                }
                case 2:{
                    while (aux != null){
                        System.out.println(aux.Data.printData());
                        aux = aux.linked;
                    }
                    break;
                }
                case 3:{
                    boolean isTrueA = true;
                    while (isTrueA){
                        MenuOptions.menuDataOfAge();
                        int caseAge = input.nextInt();
                        switch (caseAge) {
                            case 0:
                                System.out.println(FontsColor.azul+"The process is over. Thank you for using our services. :)");
                                isTrueA = false;
                                break;
                            case 1:
                                printUserByAge.printSeniorUser(aux);
                                break;
                            case 2:
                                printUserByAge.printMinorUser(aux);
                                break;
                            case 3:
                                System.out.println(FontsColor.naranja+"Enter age in the range " + FontsColor.rojo+"Min" +
                                        " and " + FontsColor.rojo+"Max");
                                int minimun = input.nextInt();
                                int maximun = input.nextInt();
                                printUserByAge.printAllUsersInAnAgeRange(header, minimun,maximun);
                                break;
                            default:
                                System.out.println(FontsColor.rojo+"<<||>>select one of the menu options<<||>>".toUpperCase());
                                break;
                        }

                    }
                    break;
                }
                case 4:{
                    boolean optionGender = true;
                    while (optionGender){
                        MenuOptions.menuDataOfgender();
                        int caseGender = input.nextInt();

                        switch (caseGender){
                            case 0:
                                System.out.println(FontsColor.azul+"The process is over. Thank you for using our services. :)");
                                optionGender = false;
                                break;
                            case 1:
                                Node auxGenderFemale = header;
                                searchUserByGender.searchUserFemale(auxGenderFemale);
                                break;
                            case 2:
                                Node auxGenderMale = header;
                                searchUserByGender.searchUserMale(auxGenderMale);
                                break;
                            default:
                                System.out.println(FontsColor.rojo+"<<||>>select one of the menu options<<||>>".toUpperCase());
                                break;
                        }
                    }
                    break;
                }
                case 6: {
                    boolean isTrueName = true;
                    while (isTrueName) {
                        MenuOptions.menuDataNames();
                        int caseName = input.nextInt();
                        switch (caseName) {
                            case 0:
                                System.out.println(FontsColor.azul + "The process is over. Thank you for using our services. :)");
                                isTrueName = false;
                                break;
                            case 1:
                                System.out.println(FontsColor.verde + "Enter the name of user:");
                                String name = input.next();
                                SearchUserByName.printEverybodyUsers(header, name);

                                break;
                            case 2:
                                System.out.println(FontsColor.verde + "Enter the name of user and last name:");
                                String nameA = input.next();
                                String lastName = input.next();
                                SearchUserByName.printUser(header, nameA, lastName);
                                break;
                            default:
                                System.out.println(FontsColor.rojo + "<<||>>select one of the menu options<<||>>".toUpperCase());
                                break;
                        }
                    }
                    break;
                }
                default:{
                    System.out.println(FontsColor.rojo+"<<||>>select one of the menu options<<||>>".toUpperCase());
                    break;
                }
            }
        }
    }
}
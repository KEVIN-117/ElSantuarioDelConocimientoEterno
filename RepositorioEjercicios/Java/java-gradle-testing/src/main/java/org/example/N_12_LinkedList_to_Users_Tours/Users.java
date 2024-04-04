package org.example.N_12_LinkedList_to_Users_Tours;

import java.util.Calendar;
import java.util.Date;

/**
 * @version 1.0.0
 * @author krodr
 */
public class Users {
    private String name;
    private String lastName;
    private String birthDay;
    private String job;
    private String gender;
    private int Id;
    private String colorYear;
    private int age;

    /**
     * @Contructor Users
     * @param gender
     * @param id
     * @param name
     * @param lastName
     * @param birthDay
     * @param job
     */
    Users(String gender,int id ,String name, String lastName, String birthDay, String job){
            this.gender = gender;
            this.Id = id;
            this.name = name;
            this.lastName = lastName;
            this.birthDay = birthDay;
            this.job = job;
            String[] listAge = this.birthDay.split("/");
            Date yearActuality = Calendar.getInstance().getTime();
            String[] year = String.valueOf(yearActuality).split(" ");
            this.age = Integer.parseInt(String.valueOf(Integer.parseInt(year[year.length-1])-Integer.parseInt(listAge[listAge.length-1])));

    }

    /**
     * @method_get getGender
     * @return gender
     */
    public String getGender() {
        if (this.gender.equals("FEMALE"))
            return FontsColor.morado+gender;
        else
            return FontsColor.azul+gender;
    }

    /**
     * @method_set setGender
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @method_get getId
     * @return ID
     */
    public int getId() {
        return Id;
    }

    /**
     * @method_set setId
     * @param id
     */
    public void setId(int id) {
        Id = id;
    }

    /**
     * @method_get getBirthDay
     * @return birthDay
     */
    public String getBirthDay() {
        if (this.gender.equals("FEMALE"))
            return FontsColor.morado+birthDay;
        else
            return FontsColor.azul+birthDay;
    }

    /**
     * @method_get getLastName
     * @return lastName
     */
    public String getLastName() {
        if (this.gender.equals("FEMALE"))
            return FontsColor.morado+lastName;
        else
            return FontsColor.azul+lastName;
    }

    /**
     * @method_get getName
     * @return name
     */
    public String getName() {
        if (this.gender.equals("FEMALE"))
            return FontsColor.morado+name;
        else
            return FontsColor.azul+name;
    }

    /**
     * @method_set setName
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @method_set setLastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @method_set setBirthDay
     * @param birthDay
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @method_get getJob
     * @return job
     */
    public String getJob() {
        if (this.gender.equals("FEMALE"))
            return FontsColor.morado+job;
        else
            return FontsColor.azul+job;
    }

    /**
     * @method_set setJob
     * @param job
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @method_set setAge
     * @apiNote el metododo setAge establece la edad que tiene el usuario por medio de su fecha de nacimineto
     * @return yearsOld
     */
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    static String genderSelect = "Her";

    /**
     * @method selectGender
     * @apiNote toma el genero del usuario y estblece con el color que se imprimira sus datos
     * @color FontsColor.morado (Mujer)
     * @Color FontsColor.azul (Varon)
     * @param gender
     */
    public void selectGender(String gender){
        if (gender != "FEMALE".toUpperCase()) {
            genderSelect = "His";

        }
    }

    /**
     * @method printData
     * @return datos del usuario
     */
    public String printData() {
        this.colorYear = FontsColor.morado;
        if (this.gender.equals("FEMALE"))
            this.colorYear = FontsColor.morado;
        else
            this.colorYear = FontsColor.azul;
        return this.colorYear+"<<Your Datas is>>:\n"+
                FontsColor.verde+genderSelect+FontsColor.verde+" gender is: "+ getGender()+
                FontsColor.verde+"\nYour ID id: " + this.colorYear + getId() +"\n" +
                FontsColor.verde+genderSelect+"name is: " +getName() + " "+ getLastName()+
                FontsColor.verde+"\nYour age: " + this.colorYear+getAge()+ this.colorYear+" years old\n"+
                FontsColor.verde+"Your birthday is: " + getBirthDay()+
                FontsColor.verde+"\nYour job is: " + getJob() + "\n";


    }
}

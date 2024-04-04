package org.example.N_13_Uers_Data;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.Date;

public class UserData implements Serializable {
    private String gender;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private String birthDay;
    private Date dateRegister;

    public UserData(String gender, String name, String secondName, String lastName, String secondLastName, String birthDay) {
        this.gender = gender;
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.birthDay = birthDay;
    }

    public String getGender() {
            return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }
}

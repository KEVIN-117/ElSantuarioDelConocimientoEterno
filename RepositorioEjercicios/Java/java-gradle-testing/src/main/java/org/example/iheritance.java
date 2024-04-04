package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class iheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        Data data= new Data();
        do{
            System.out.println("1.- Regitrar\n2.-Listar");
            n = input.nextInt();

            switch (n){
                case 1:{
                    Student student = new Student(input.next(), input.next(), input.nextInt(), input.nextInt());
                    data.addStudent(student);
                    break;
                }
                case 2:{
                    data.getData();
                }
            }
        }while (n!=0);
    }
}
class Student{
    private String name;
    private String lastName;
    private Integer RU;
    private  Integer CI;

    public Student(String name, String lastName, Integer RU, Integer CI) {
        this.name = name;
        this.lastName = lastName;
        this.RU = RU;
        this.CI = CI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getRU() {
        return RU;
    }

    public void setRU(Integer RU) {
        this.RU = RU;
    }

    public Integer getCI() {
        return CI;
    }

    public void setCI(Integer CI) {
        this.CI = CI;
    }

    @Override
    public String toString() {
        return "Your data is:\n" + "Name: " + getName() +"\n"+
                "Last Name: " + getLastName() +"\n"+
                "RU: " + getRU() +"\n"+
                "CI: " + getCI();
    }
}

class Data{
    private ArrayList<Student> dataStudent;
    private Student student;

    public Data(){
        this.dataStudent = new ArrayList<>();
    }

    public void addStudent(Student item){
        this.dataStudent.add(item);
    }
    public void getData(){
        for (int i = 0; i < this.dataStudent.size(); i++) {
            System.out.println(dataStudent.get(i).toString());
        }

    }

}
package org.example.N_28_POO.GuiStudents.management;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Student {
    private String name;
    private String lastName;
    private String ci;
    private Integer age;
    private Date birthDate;
    private Double average;

    private ArrayList<Matter> matters;
    private ArrayList<Grade> grades;

    public ArrayList<Matter> getMatters() {
        return matters;
    }

    public void setMatters(ArrayList<Matter> matters) {
        this.matters = matters;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public Student(String name, String lastName, String ci, Integer age, Date birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.ci = ci;
        this.age = age;
        this.birthDate = Objects.requireNonNullElseGet(birthDate, Date::new);
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

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average;
    }

    // other methods
    public String getFullName(){
        return this.name + " " + this.getLastName();
    }

    public void showGrades(){
        this.grades.sort((item1, item2) -> {
            Grade grade1 = (Grade) item1;
            Grade grade2 = (Grade) item2;
            return Double.compare(grade1.getFinalGrade(), grade2.getFinalGrade());
        });

        this.grades.forEach((item) ->{
            Grade grade = (Grade) item;
            grade.showGrade();
        });
    }

    private void calculateAverage(){
        this.average = this.grades.stream().mapToDouble(Grade::getFinalGrade).sum()/this.grades.size();
    }

    public void addGrade(Grade grade){
        this.grades.add(grade);
        this.calculateAverage();
    }

    public void programMatters(Matter matter){
        this.matters.add(matter);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ci='" + ci + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                ", average=" + average +
                ", matters=" + matters +
                ", grades=" + grades +
                '}';
    }
}

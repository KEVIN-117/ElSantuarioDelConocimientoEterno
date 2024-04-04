package org.example.N_28_POO.GuiStudents.management;

public class Grade {
    private Matter matter;
    private Student student;
    private Double finalGrade;
    public Grade(Student student, Matter matter) {
        this.student = student;
        this.matter = matter;
    }
    public void showGrade() {
        System.out.println(this.matter.getCode() + " " + this.student.getName() + " " + this.student.getLastName() + " " + this.finalGrade);
    }
    public Double getFinalGrade() {
        return finalGrade;
    }
    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }
}

package org.example.N_28_POO.GuiStudents.management;

import org.example.N_28_POO.GuiStudents.generic.GenericIterator;

public class ManagementGrade {
    private GenericIterator<Student> students;
    private GenericIterator<Matter> matters;

    public ManagementGrade() {
        this.students = new GenericIterator<>();
        this.matters = new GenericIterator<>();
    }

    public GenericIterator<Student> getStudents() {
        return students;
    }



    public GenericIterator<Matter> getMatters() {
        return matters;
    }

    public void addMatters(Matter matter) {
        this.matters.add(matter);
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }


    public Student getStudent(String ci) {
        System.out.println(students);
        Student result = this.students.find((item) -> {
            Student student = (Student) item;
            if(student.getCi().equals(ci)) {
                return true;
            }
            return false;
        });
        return result;
    }

    public Matter getMatter(String code){
        Matter result = this.matters.find((iterable -> {
            Matter matter = (Matter) iterable;
            if (matter.getCode().equals(code)){
                return true;
            }
            return false;
        }));
        return result;
    }
    public void printOrderGrades(){
        this.students.sort((itemA, itemB)->{
            Student a = (Student) itemA;
            Student b = (Student) itemB;
            return Double.compare(a.getAverage(), b.getAverage());
        });

        this.students.forEach(item ->{
            Student student = (Student) item;
            System.out.println("-->" + student.getName() + " " + student.getLastName() + " " + student.getAge());
        });
    }
    public void printGradeAll() {
        this.students.sort((item1, item2)->{
            Student student1 = (Student) item1;
            Student student2 = (Student) item2;
            return student1.getFullName().compareTo(student2.getFullName());
        });
        this.students.forEach(item -> {
            Student student = (Student) item;
            student.showGrades();
        });
    }

}

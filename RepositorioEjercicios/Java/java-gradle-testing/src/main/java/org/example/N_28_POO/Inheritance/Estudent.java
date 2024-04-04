package org.example.N_28_POO.Inheritance;

public class Estudent extends Person{
    private String semestre;

    public Estudent(String name, String lastName, String semestre) {
        super(name, lastName);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
}

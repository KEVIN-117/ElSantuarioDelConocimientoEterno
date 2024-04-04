package org.example.Sis_211;

public class Person {
    private String name;
    private String lastNane;
    private Integer ci;
    private Integer age;

    public Person(String name, String lastNane, Integer ci, Integer age) {
        this.name = name;
        this.lastNane = lastNane;
        this.ci = ci;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastNane() {
        return lastNane;
    }

    public void setLastNane(String lastNane) {
        this.lastNane = lastNane;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String printData(){
        return getName() +" " + getLastNane() + " " + getCi() + " " +  getAge();
    }
}

class Student extends Person{
    private Integer Ru;
    private String carrera;

    public Integer getRu() {
        return Ru;
    }

    public void setRu(Integer ru) {
        Ru = ru;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Student(String name, String lastNane, Integer ci, Integer age) {
        super(name, lastNane, ci, age);

    }
}
class Employed extends Person{
    private String codigo;
    private String unidad;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public Employed(String name, String lastNane, Integer ci, Integer age) {
        super(name, lastNane, ci, age);
    }
}

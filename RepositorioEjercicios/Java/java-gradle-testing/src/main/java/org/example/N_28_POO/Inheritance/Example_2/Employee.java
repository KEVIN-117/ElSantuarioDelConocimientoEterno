package org.example.N_28_POO.Inheritance.Example_2;

public abstract class Employee {
    private String name;
    private String lastName;
    private String nationality;
    private Integer employeeNumber;
    private Double baseSalary;

    public Employee(String name, String lastName, String nationality, Integer employeeNumber, Double baseSalary) {
        this.name = name;
        this.lastName = lastName;
        this.nationality = nationality;
        this.employeeNumber = employeeNumber;
        this.baseSalary = baseSalary;
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

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", baseSalary=" + baseSalary +
                '}';
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract String showInformation();
    public abstract Double calculateSalary();
}

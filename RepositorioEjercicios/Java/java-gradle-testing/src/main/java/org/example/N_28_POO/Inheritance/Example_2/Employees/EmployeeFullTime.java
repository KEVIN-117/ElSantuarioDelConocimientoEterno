package org.example.N_28_POO.Inheritance.Example_2.Employees;

import org.example.N_28_POO.Inheritance.Example_2.Employee;

public class EmployeeFullTime extends Employee {
    private final Integer NUMBER_MONTH = 12;
    private Double annualSalary;

    public EmployeeFullTime(String name, String lastName, String nationality, Integer employeeNumber, Double baseSalary, Double annualSalary) {
        super(name, lastName, nationality, employeeNumber, baseSalary);
        this.annualSalary = annualSalary;
    }


    /**
     * @return
     */
    @Override
    public String showInformation() {
        String instanceMessage = "";
        if (this instanceof Employee){
            instanceMessage = "La clase EmployeeFullTime es hijo de Eployee";
        }
        return super.toString() + "EmployeeFullTime{" +
                " annualSalary=" + annualSalary +
                '}' + instanceMessage;
    }

    @Override
    public String toString() {
        return "EmployeeFullTime{" +
                "NUMBER_MONTH=" + NUMBER_MONTH +
                ", annualSalary=" + annualSalary +
                '}';
    }

    /**
     * @return
     */
    @Override
    public Double calculateSalary() {
        return this.annualSalary/this.NUMBER_MONTH;
    }
}

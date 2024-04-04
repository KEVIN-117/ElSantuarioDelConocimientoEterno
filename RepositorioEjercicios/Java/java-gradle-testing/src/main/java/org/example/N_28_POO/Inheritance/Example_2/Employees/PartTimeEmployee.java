package org.example.N_28_POO.Inheritance.Example_2.Employees;

import org.example.N_28_POO.Inheritance.Example_2.Employee;

public class PartTimeEmployee extends Employee {


    public PartTimeEmployee(String name, String lastName, String nationality, Integer employeeNumber, Double baseSalary) {
        super(name, lastName, nationality, employeeNumber, baseSalary);
    }

    /**
     * @return
     */
    @Override
    public String showInformation() {
        return null;
    }

    /**
     * @return
     */
    @Override
    public Double calculateSalary() {
        return null;
    }
}

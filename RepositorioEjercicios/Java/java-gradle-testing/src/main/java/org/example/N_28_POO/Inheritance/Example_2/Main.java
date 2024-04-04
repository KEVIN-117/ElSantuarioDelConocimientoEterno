package org.example.N_28_POO.Inheritance.Example_2;

import org.example.N_28_POO.Inheritance.Example_2.Employees.EmployeeFullTime;

public class Main {
    public static void main(String[] args) {
        Employee employee = new EmployeeFullTime("Kevin Alexis", "Rodriguez Condori", "en", 1, 10.0, 100.0);
        System.out.println(employee.showInformation());
    }
}

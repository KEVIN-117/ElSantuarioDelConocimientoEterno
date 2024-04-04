package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.LinuxButtons;

import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.Button;

public class LinuxButton implements Button {
    @Override
    public void render(int a, int b) {
        System.out.println("LinuxButton " + (Math.max(a, b)));
    }

    @Override
    public void onClick(String f) {
        System.out.println("LinuxButton ");
    }
}

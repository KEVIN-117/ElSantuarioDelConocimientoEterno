package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.WebButtons;

import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.Button;

public class HTMLButton implements Button {
    @Override
    public void render(int a, int b) {

        System.out.println("HTMLButton " + a+b);
        onClick("hello...!!!");
    }

    @Override
    public void onClick(String f) {
        System.out.println("HTMLButton " + f);
    }
}

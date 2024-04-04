package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.WindowsButtons;

import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.Button;

public class WindowButton implements Button {

    @Override
    public void render(int a, int b) {
        System.out.println("WindowButton " + (a+b));
    }

    @Override
    public void onClick(String f) {
        System.out.println("WindowButton " + f);
    }
}

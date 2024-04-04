package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod;

import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.WindowsButtons.WindowButton;

public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {
        return new WindowButton();
    }
}

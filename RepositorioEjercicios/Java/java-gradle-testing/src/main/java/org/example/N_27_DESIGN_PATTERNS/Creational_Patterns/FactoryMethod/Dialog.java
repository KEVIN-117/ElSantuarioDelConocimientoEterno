package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod;

public abstract class Dialog {
    public abstract Button createButton();


    public void render(){
        Button okButton = createButton();
        okButton.render(10, 20);
    }
}

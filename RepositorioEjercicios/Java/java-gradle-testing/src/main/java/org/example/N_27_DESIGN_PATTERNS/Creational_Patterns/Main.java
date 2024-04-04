package org.example.N_27_DESIGN_PATTERNS.Creational_Patterns;

import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.Dialog;
import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.LinuxDialog;
import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.WebDialog;
import org.example.N_27_DESIGN_PATTERNS.Creational_Patterns.FactoryMethod.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void initialize(int opt){
        if (opt == 1){
            dialog = new WindowsDialog();
        }else if(opt == 2) {
            dialog = new WebDialog();
        } else if (opt == 3) {
            dialog = new LinuxDialog();
        }
    }
    public static void main(String[] args) {
        initialize(1);
        dialog.render();

        System.out.println();
        initialize(2);
        dialog.render();

        System.out.println();
        initialize(3);
        dialog.render();
    }
}

package org.example.N_28_POO.GuiStudents.components;

import javax.swing.*;
import java.awt.*;

public class ComboBox extends JComboBox<String> {
    public ComboBox(String[] names, Point point, Dimension size, Color color ) {
        super(names);
        this.setLocation(point);
        this.setSize(size);
        this.setBackground(color);

    }
}

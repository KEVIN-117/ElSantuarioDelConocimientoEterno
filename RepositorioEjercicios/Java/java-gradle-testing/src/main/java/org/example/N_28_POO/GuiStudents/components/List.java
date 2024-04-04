package org.example.N_28_POO.GuiStudents.components;

import javax.swing.*;
import java.awt.*;

public class List extends JList<String> {
    public List(String[] data, Point point, Dimension dimencion) {
        super(data);
        this.setLocation(point);
        this.setSize(dimencion);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.GREEN);
    }
}

package org.example.N_28_POO.GuiStudents.components;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    public Panel(Point point, Dimension size, Color color) {
        super();
        this.setLocation(point);
        this.setSize(size);
        this.setBackground(color);
        this.setLayout(null);
    }
    public Panel(Point point, Dimension size) {
        super();
        this.setLocation(point);
        this.setSize(size);
        this.setLayout(null);
    }
    public Panel(Color color) {
        super();
        this.setBackground(color);
        this.setLayout(null);
    }

    public Panel(LayoutManager layout, Color color) {
        this.setLayout(layout);
        this.setBackground(color);
    }
}

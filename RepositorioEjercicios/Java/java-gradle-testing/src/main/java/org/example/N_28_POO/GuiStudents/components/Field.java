package org.example.N_28_POO.GuiStudents.components;

import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import java.awt.*;

public class Field extends JTextField {
    public Field(String content, Point point, Dimension size) {
        super(content);
        this.setSize(size);
        this.setLocation(point);
        this.setForeground(Color.DARK_GRAY);
        this.setBackground(Color.WHITE);
        this.setCaretColor(Color.BLUE);
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(null);
    }
    public Field(String content) {
        super(content);
        this.setSize(new Dimension(200,40));
        this.setLocation(new Point(0,0));
        //this.setForeground(Color.WHITE);
        //this.setBackground(ColorPalete.primary1.getColorA());
        this.setFont(new Font("Arial", Font.PLAIN, 12));
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setLayout(null);
    }
}

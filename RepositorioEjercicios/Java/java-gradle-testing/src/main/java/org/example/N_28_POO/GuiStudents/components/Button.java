package org.example.N_28_POO.GuiStudents.components;

import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

import static org.example.N_28_POO.GuiStudents.theme.ColorPalete.purple3;

public class Button extends JButton {
    public Button(String text) {
        super(text);
    }

    public Button(String function, Point point, Dimension size, Color color ) {
        super(function);
        this.setLocation(point);
        this.setSize(size);
        this.setBackground(color);

    }
    public Button(String title, Color color) {
        super(title.toUpperCase());
        this.setSize(new Dimension(80, 100));
        this.setBorder(new EmptyBorder(10,5,10,5));

        this.setAutoscrolls(true);
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setDoubleBuffered(true);
        this.setFocusCycleRoot(true);
        this.setFocusTraversalPolicyProvider(true);
        this.setHideActionText(true);
        this.setSelected(true);

        if (color == null){
            this.setBackground(ColorPalete.primary1.getColorA());
        }else {
            this.setBackground(color);
        }

    }
    public Button(String function, Point point, Dimension size) {
        super(function);
        this.setLocation(point);
        this.setSize(size);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Arial Black", Font.PLAIN, 12));
    }
}

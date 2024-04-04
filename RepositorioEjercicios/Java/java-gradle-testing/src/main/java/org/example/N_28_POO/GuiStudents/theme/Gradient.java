package org.example.N_28_POO.GuiStudents.theme;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Gradient {
    private Color primary;
    private Color secondary;
    private JPanel panel;

    public Gradient(Color primary, Color secondary) {
        this.primary = primary;
        this.secondary = secondary;
    }

    public JPanel getPanel() {
        return new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                        new Point2D.Float(0, 0), primary,
                        new Point2D.Float(getWidth(), getHeight()), secondary
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

    public JButton getBgButton() {
        return new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                GradientPaint gradient = new GradientPaint(
                        new Point2D.Float(0, 0), primary,
                        new Point2D.Float(getWidth(), getHeight()), secondary
                );
                g2d.setPaint(gradient);
                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };
    }

}

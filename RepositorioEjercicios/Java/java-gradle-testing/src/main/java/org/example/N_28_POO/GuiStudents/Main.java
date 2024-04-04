package org.example.N_28_POO.GuiStudents;

import org.example.N_28_POO.GuiStudents.app.Window;
import org.example.N_28_POO.GuiStudents.layout.DashBoard;
import org.example.N_28_POO.GuiStudents.management.ManagementGrade;
import org.example.N_28_POO.GuiStudents.theme.ColorPalete;
import org.example.N_28_POO.GuiStudents.theme.Gradient;
import org.example.N_28_POO.GuiStudents.theme.Nebula;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            Window window = new Window("Management", new Dimension(800, 500), new ManagementGrade());
        });

        /*SwingUtilities.invokeLater(()->{
            JFrame frame = new JFrame();
            DashBoard dashBoard = new DashBoard(new ManagementGrade());
            frame.add(dashBoard);
            frame.setBounds(0,0,500,500);
            frame.setLocationRelativeTo(null);
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });*/
    }
}

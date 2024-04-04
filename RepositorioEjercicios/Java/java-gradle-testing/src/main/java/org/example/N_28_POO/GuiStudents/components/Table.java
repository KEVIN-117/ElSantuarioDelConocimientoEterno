package org.example.N_28_POO.GuiStudents.components;

import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Table extends JTable {
    private String[] colums;
    private DefaultTableModel model;

    public Table(String[] columnas, Point point, Dimension size) {
        super();
        this.colums = columnas;
        this.setLocation(point);
        this.setSize(size);
        this.model = (DefaultTableModel) this.getModel();
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Verdana", 0, 12));

        this.setColumnas();
    }

    public Table(String[] columnas) {
        super();
        this.colums = columnas;
        this.model = (DefaultTableModel) this.getModel();
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setFont(new Font("Verdana", 0, 12));
        this.setColumnas();
    }

    private void setColumnas() {
        for (String columna : this.colums) {
            this.model.addColumn(columna);
        }
    }

    public void clean() {
        this.model.setRowCount(0);

    }

    public void addRow(String[] row) {
        this.model.addRow(row);
    }
}

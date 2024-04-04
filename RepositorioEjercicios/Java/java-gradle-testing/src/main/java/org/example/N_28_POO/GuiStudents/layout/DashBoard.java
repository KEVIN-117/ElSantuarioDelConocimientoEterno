package org.example.N_28_POO.GuiStudents.layout;

import org.example.N_28_POO.GuiStudents.components.Button;
import org.example.N_28_POO.GuiStudents.components.Field;
import org.example.N_28_POO.GuiStudents.components.Panel;
import org.example.N_28_POO.GuiStudents.components.Table;
import org.example.N_28_POO.GuiStudents.management.ManagementGrade;
import org.example.N_28_POO.GuiStudents.management.Student;
import org.example.N_28_POO.GuiStudents.theme.ColorPalete;
import org.example.N_28_POO.Inheritance.Estudent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

public class DashBoard extends Panel {
    private ManagementGrade managementGrade;
    private Panel panel;
    private Panel northPanel;
    private Panel centerPanel;
    private Button searchButton;
    private Field field;
    private Table table;
    public DashBoard(ManagementGrade managementGrade) {
        super(new Point(0,0), new Dimension(150,300), Color.white);
        this.managementGrade = managementGrade;
        this.setLayout(new CardLayout());
        this.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.bodyBg.getColorA(), 20, true));
        loadLayout();
    }

    private void loadLayout() {
        panel = new Panel(new BorderLayout(), ColorPalete.bodyBg.getColorA());
        northPanel = new Panel(new GridLayout(0,4, 10, 0), ColorPalete.bodyBg.getColorA());
        centerPanel = new Panel(new GridLayout(1,1,10,10), ColorPalete.bodyBg.getColorA());

        northPanel.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.bodyBg.getColorA(), 20, true));

        searchButton = new Button("Buscar", ColorPalete.SECONDARY.getColorA());
        field = new Field("Buscar Estudiante");
        String[] headers = {"Ci", "Nombres ", "Apellidos", "Edad"};

        table = new Table(headers, new Point(0,50), new Dimension(500,500));

        table.setLayout(new CardLayout());
        // String[] content = {" 1 ", "test", "email@test.com", "2"};
        table.addRow(headers);
        northPanel.add(field);
        northPanel.add(searchButton);
        centerPanel.add(table);

        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        this.add(panel);
        loadData(this.managementGrade.getStudents());
        loadEvent();
    }

    private void loadEvent() {
        field.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if(field.getText().equals("Buscar Estudiante")) {
                    field.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {

            }
        });

        searchButton.addActionListener((actionEvent -> {
            if (!field.getText().equals("")){
                Student student = this.managementGrade.getStudent(field.getText());
                if (student != null){
                    loadData(student);
                }
                JOptionPane.showInternalMessageDialog(null, "Estudiante no encontrado", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        }));
    }

    public void loadData(Student student){
        this.table.clean();

        String[] dataRow = new String[4];
        dataRow[0] = student.getCi();
        dataRow[1] = student.getName();
        dataRow[2] = student.getLastName();
        dataRow[3] = student.getAge().toString();
        this.table.addRow(dataRow);
    }

    public void loadData(ArrayList<Student> data){
        this.managementGrade.getStudents();
        data.forEach((item)->{
            String[] dataRow = new String[4];
            dataRow[0] = item.getCi();
            dataRow[1] = item.getName();
            dataRow[2] = item.getLastName();
            dataRow[3] = item.getAge().toString();
            table.addRow(dataRow);
        });
    }
}

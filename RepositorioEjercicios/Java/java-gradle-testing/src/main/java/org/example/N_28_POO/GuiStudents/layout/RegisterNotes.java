package org.example.N_28_POO.GuiStudents.layout;

import org.example.N_28_POO.GuiStudents.components.Button;
import org.example.N_28_POO.GuiStudents.components.Field;
import org.example.N_28_POO.GuiStudents.components.Label;
import org.example.N_28_POO.GuiStudents.components.Panel;
import org.example.N_28_POO.GuiStudents.components.Table;
import org.example.N_28_POO.GuiStudents.management.ManagementGrade;
import org.example.N_28_POO.GuiStudents.management.Student;
import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Objects;

public class RegisterNotes extends Panel {
    private ManagementGrade managementGrade;
    private Button searchButton;
    private Field fieldSearch;
    private Panel panel;
    private Panel northPanel, actionPanel;
    private Panel centerPanel;
    private JComboBox<String> comboBox;

    private Label studentName;
    private Label studentLastName;
    private Label age;
    private Label nota;
    private Label matter;
    private Field studentField;
    private Field lastNameField;
    private Field ageField;
    private Field noteField;

    public RegisterNotes(ManagementGrade managementGrade) {
        super(new Point(0,0), new Dimension(150,300), Color.white);
        this.managementGrade = managementGrade;
        this.setLayout(new CardLayout());
        this.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.bodyBg.getColorA(), 20, true));
        loadLayout();
    }

    private void loadLayout() {
        panel = new Panel(new BorderLayout(), ColorPalete.bodyBg.getColorA());
        northPanel = new Panel(new GridLayout(0,4, 10, 0), ColorPalete.bodyBg.getColorA());
        centerPanel = new Panel(null, ColorPalete.bodyBg.getColorA());
        this.centerPanel.setLayout(new BoxLayout(this.centerPanel, BoxLayout.Y_AXIS));
        this.centerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.transparent.getColorA(), 40, true));
        this.actionPanel = new Panel(new GridLayout(0,4, 10, 0), ColorPalete.bodyBg.getColorA());
        northPanel.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.bodyBg.getColorA(), 20, true));

        searchButton = new Button("Buscar", ColorPalete.SECONDARY.getColorA());
        fieldSearch = new Field("Buscar Estudiante");

        // form
        studentName = new Label("Nombre del estudiante", new Point(10,10), new Dimension(100, 40));
        studentLastName = new Label("Apellido del estudiante", new Point(10,50), new Dimension(100, 40));
        age = new Label("Age", new Point(10,150), new Dimension(100, 40));
        nota = new Label("Final note", new Point(10,150), new Dimension(100, 40));
        matter = new Label("Materia", new Point(10,150), new Dimension(100, 40));

        studentField = new Field("", new Point(110,10), new Dimension(100, 40));
        lastNameField = new Field("", new Point(110,50), new Dimension(100, 40));
        ageField = new Field("", new Point(110,150), new Dimension(100, 40));
        noteField = new Field("", new Point(110,150), new Dimension(100, 40));
        this.comboBox = new JComboBox<>();

        this.comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"algebra", "Tecnicas Programacion 2", "Modelos Economicos"}));


        Button button = new Button("Registrar Nota del Estudiante", new Point(240,0), new Dimension(200,40));


        northPanel.add(fieldSearch);
        northPanel.add(searchButton);

        this.centerPanel.add(studentName);
        this.centerPanel.add(studentField);
        this.centerPanel.add(studentLastName);
        this.centerPanel.add(lastNameField);
        this.centerPanel.add(age);
        this.centerPanel.add(ageField);
        this.centerPanel.add(nota);
        this.centerPanel.add(noteField);
        this.centerPanel.add(matter);
        this.centerPanel.add(this.comboBox);

        this.actionPanel.add(button);


        panel.add(northPanel, BorderLayout.NORTH);
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(actionPanel, BorderLayout.SOUTH);
        this.add(panel);
        // loadData(this.managementGrade.getStudent());
        loadEvent();
    }

    private void loadEvent() {
        this.fieldSearch.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent focusEvent) {
                if(fieldSearch.getText().equals("Buscar Estudiante")){
                    fieldSearch.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent focusEvent) {

            }
        });
        searchButton.addActionListener((action)->{
            if (!fieldSearch.getText().equals("")){
                Student student = this.managementGrade.getStudent(fieldSearch.getText());
                System.out.println(student);
                if (student != null) {
                    loadData(student);
                    return;
                }

            }
            JOptionPane.showInternalMessageDialog(null, "Estudiante no encontrado", "Error", JOptionPane.INFORMATION_MESSAGE);
        });

        this.comboBox.addActionListener((actionEvent -> {
            String selected = Objects.requireNonNull(comboBox.getSelectedItem()).toString();
            System.out.println(selected);
        }));
    }
    private void loadData(Student student){
        this.studentField.setText(student.getName());
        this.lastNameField.setText(student.getLastName());
        this.ageField.setText(student.getAge().toString());
    }
}

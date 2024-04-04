package org.example.N_28_POO.GuiStudents.layout;

import org.example.N_28_POO.GuiStudents.components.*;
import org.example.N_28_POO.GuiStudents.components.Button;
import org.example.N_28_POO.GuiStudents.components.Label;
import org.example.N_28_POO.GuiStudents.components.Panel;
import org.example.N_28_POO.GuiStudents.management.ManagementGrade;
import org.example.N_28_POO.GuiStudents.management.Student;
import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Objects;

public class RegisterStudent extends Panel {
    private ManagementGrade managementGrade;
    private Panel panelForm;
    private Panel panelButton;
    private Panel content;
    private Table table;
    public RegisterStudent(ManagementGrade managementGrade) {
        super(new Point(0,0), new Dimension(600,600),Color.BLACK);
        this.managementGrade = managementGrade;

        this.setLayout(new GridLayout(1,1, 20, 20));

        loadLAyout();

    }

    private void loadLAyout() {
        this.content = new Panel(new BorderLayout(), ColorPalete.blue1.getColorA());
        this.panelForm = new Panel(null, ColorPalete.blue1.getColorA());
        this.panelForm.setLayout(new BoxLayout(this.panelForm, BoxLayout.Y_AXIS));
        this.panelForm.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.transparent.getColorA(), 40, true));
        this.panelButton = new Panel(new GridLayout(0,2,10,10), ColorPalete.blue1.getColorA());
        this.panelButton.setBorder(javax.swing.BorderFactory.createLineBorder(ColorPalete.transparent.getColorA(), 50, true));
        Label studentName = new Label("Nombre del estudiante", new Point(10,10), new Dimension(100, 40));
        Label studentLastName = new Label("Apellido del estudiante", new Point(10,50), new Dimension(100, 40));
        Label ci = new Label("Carnet de Identidad", new Point(10,100), new Dimension(100, 40));
        Label age = new Label("Age", new Point(10,150), new Dimension(100, 40));

        Field studentField = new Field("", new Point(110,10), new Dimension(100, 40));
        Field lastNameField = new Field("", new Point(110,50), new Dimension(100, 40));
        Field ciField = new Field("", new Point(110,100), new Dimension(100, 40));
        Field ageField = new Field("", new Point(110,150), new Dimension(100, 40));




        Button button = new Button("Crear cuenta del Estudiante", new Point(240,0), new Dimension(200,40));
        button.setBorder(new EmptyBorder(15,10,15,10));
        //this.add(button);
        this.panelForm.add(studentName);
        this.panelForm.add(studentField);
        this.panelForm.add(studentLastName);
        this.panelForm.add(lastNameField);
        this.panelForm.add(age);
        this.panelForm.add(ageField);
        this.panelForm.add(ci);
        this.panelForm.add(ciField);
        this.panelButton.add(button);

        this.content.add(this.panelForm, BorderLayout.CENTER);
        this.content.add(this.panelButton, BorderLayout.SOUTH);
        this.add(content);
        button.addActionListener((event) -> {
            if(!Objects.equals(studentField.getText(), "") && !Objects.equals(lastNameField.getText(), "") && !Objects.equals(ciField.getText(), "") && !Objects.equals(ageField.getText(), "")) {
                Integer Age = Integer.parseInt(ageField.getText());
                Student student = new Student(studentField.getText(), lastNameField.getText(), ciField.getText(), Age, null);
                this.managementGrade.addStudent(student);
                System.out.println(student);
                return;
            }
            JOptionPane.showInternalMessageDialog(null, "InfoBox: Datos no validos", "Error", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}

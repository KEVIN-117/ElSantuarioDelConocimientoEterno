package org.example.N_28_POO.GuiStudents.app;

import org.example.N_28_POO.GuiStudents.components.Button;
import org.example.N_28_POO.GuiStudents.components.Panel;
import org.example.N_28_POO.GuiStudents.layout.DashBoard;
import org.example.N_28_POO.GuiStudents.layout.GradeStudent;
import org.example.N_28_POO.GuiStudents.layout.RegisterNotes;
import org.example.N_28_POO.GuiStudents.layout.RegisterStudent;
import org.example.N_28_POO.GuiStudents.management.ManagementGrade;
import org.example.N_28_POO.GuiStudents.theme.ColorPalete;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RoundRectangle2D;

import static org.example.N_28_POO.GuiStudents.theme.ColorPalete.*;

public class Window extends JFrame {
    private Panel north;
    private Panel south;
    private Panel right;
    private Panel left;
    private Panel content;
    private ManagementGrade manager;

    public Window(String title, Dimension size, ManagementGrade manager) {
        super(title);
        this.manager = manager;
        this.setSize(size);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        panel();
        button();

    }

    private void panel() {
        this.north = new Panel(primary1.getColorA());
        this.north.setLayout(new GridLayout(1,0, 10, 0));
        this.north.setBorder(new EmptyBorder(5,5,5,5));

        this.content = new Panel(bodyBg.getColorA());
        this.content.setLayout(new BoxLayout(this.content, BoxLayout.Y_AXIS));
        this.content.setBorder(new BevelBorder(BevelBorder.RAISED, purple3.getColorA(), purple3.getColorB()));
        this.add(this.north, BorderLayout.NORTH);
        this.add(this.content, BorderLayout.CENTER);
    }

    private void button() {
        Button studentsList = new Button("Students List", PRIMARY.getColorA());
        Button studentNotes = new Button("Student Notes", PRIMARY.getColorA());
        Button registerStudents = new Button("Register Students", PRIMARY.getColorA());
        Button recordStudentNotes = new Button("record student notes", PRIMARY.getColorA());
        Button scheduleSubjects = new Button("schedule subjects", PRIMARY.getColorA());

        studentsList.addActionListener((actionEvent)->{
            createCoponet("dashBoard");
        });
        studentNotes.addActionListener((actionEvent)->{
            createCoponet("Grades");
        });
        registerStudents.addActionListener((actionEvent)->{
            createCoponet("register");
        });
        recordStudentNotes.addActionListener((actionEvent)->{
            createCoponet("matters");
        });
        scheduleSubjects.addActionListener((actionEvent)->{
            createCoponet("programSubjets");
        });

        this.north.add(studentsList);
        this.north.add(studentNotes);
        this.north.add(registerStudents);
        this.north.add(recordStudentNotes);
        this.north.add(scheduleSubjects);
    }


    private void cleanComponent(){
        if (this.content.getComponents().length > 0){
            Component component = this.content.getComponent(0);
            if (component != null){
                this.content.remove(component);
            }
        }
    }
    private void createCoponet(String name){
        Component component = null;
        cleanComponent();
        switch (name){
            case "dashBoard":{
                component = new DashBoard(this.manager);

                break;
            }

            case "Grades":{
                component = new GradeStudent(this.manager);
                break;
            }

            case "register":{
                component = new RegisterStudent(this.manager);
                break;
            }

            case "matters":{
                component = new RegisterNotes(this.manager);
                break;
            }

            case "programSubjets":{
                component = null;
                break;
            }
        }
        this.content.add(component);
        this.revalidate();
        this.repaint();
    }

}

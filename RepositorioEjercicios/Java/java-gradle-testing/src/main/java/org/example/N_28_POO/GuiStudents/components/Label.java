package org.example.N_28_POO.GuiStudents.components;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Label extends JLabel{

    public Label( String txt ,Point point, Dimension size, Color color, Font font) {
        super(txt);
        //this.setText(txt);
        this.setLocation(point);
        this.setSize(size);
        this.setBackground(color);
        this.setFont(font);
        this.setLayout(null);
    }
    public Label( String txt ,Point point, Dimension size) {
        super(txt);
        this.setLocation(point);
        this.setSize(size);
        this.setLayout(null);
    }
    public Label( String txt) {
        super(txt);
        this.setLayout(new GridLayout(1,0,2,2));
    }
    public void setImage(String pathFile, Integer w, Integer h) {
        File file = new File(pathFile);
        BufferedImage image;
        try {
            image = ImageIO.read(file);
            Image imageView = image.getScaledInstance(w, h, 10);
            ImageIcon icon = new ImageIcon(imageView);
            this.setIcon(icon);
        } catch (IOException e) {
            System.out.println("Error en Label swtImage() " +e.getMessage());
            e.printStackTrace();
        }
    }
}

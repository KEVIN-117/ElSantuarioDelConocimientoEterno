/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iplementaciones.LoadWimdow;

import java.awt.Dimension;
import java.awt.Point;


public class JLabel extends javax.swing.JLabel{

    public JLabel(String txt, Point point, Dimension dimension) {
        super(txt);
        this.setSize(dimension);
        this.setLocation(point);
        this.setLayout(null);
    }
    
}


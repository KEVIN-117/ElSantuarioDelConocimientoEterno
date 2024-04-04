
package Iplementaciones.LoadWimdow;

import Iplementaciones.Data;
import java.awt.Dimension;
import java.awt.Point;

public class JTextArea extends javax.swing.JTextArea{

    public JTextArea(Point point, Dimension dimension) {
        this.setSize(dimension);
        this.setLocation(point);
    }

    public void setText(Data user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
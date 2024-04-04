
package Implementaciones.LoadWindow;

import java.awt.Dimension;
import java.awt.Point;

public class JTextArea extends javax.swing.JTextArea{

    public JTextArea(Point point, Dimension dimension) {
        this.setSize(dimension);
        this.setLocation(point);
    }

    
}
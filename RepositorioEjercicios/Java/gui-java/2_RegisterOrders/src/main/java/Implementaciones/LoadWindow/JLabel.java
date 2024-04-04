
package Implementaciones.LoadWindow;

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


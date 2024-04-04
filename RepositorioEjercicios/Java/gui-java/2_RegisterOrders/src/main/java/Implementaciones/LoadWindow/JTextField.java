
package Implementaciones.LoadWindow;

import java.awt.Dimension;
import java.awt.Point;

public class JTextField extends javax.swing.JTextField{

    public JTextField( Point point, Dimension dimension) {
        super();
        this.setSize(dimension);
        this.setLocation(point);
    }
    
}
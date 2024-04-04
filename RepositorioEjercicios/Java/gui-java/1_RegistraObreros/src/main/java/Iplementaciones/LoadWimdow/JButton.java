
package Iplementaciones.LoadWimdow;

import java.awt.Dimension;
import java.awt.Point;

public class JButton extends javax.swing.JButton{

    public JButton(String texto, Point point, Dimension dimension) {
        super(texto);
        this.setSize(dimension);
        this.setLocation(point);
        this.setLayout(null);
    }

    public JButton(String texto) {
        super(texto);
        this.setSize(new Dimension(100,30));
    }
    
    
}

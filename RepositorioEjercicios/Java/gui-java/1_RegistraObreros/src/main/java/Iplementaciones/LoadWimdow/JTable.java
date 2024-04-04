
package Iplementaciones.LoadWimdow;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.table.DefaultTableModel;
public class JTable extends javax.swing.JTable{
    private String[] columnas;
    private DefaultTableModel model;

    public JTable(String[] columnas, Point point, Dimension dimension) {
        super();
        this.columnas = columnas;
        this.setLocation(point);
        this.setSize(dimension);
        this.model = (DefaultTableModel) this.getModel();
        this.setColumnas();
    }

    public void setColumnas() {
        for(Integer i = 0; i < this.columnas.length; i++ ) {
            this.model.addColumn(this.columnas[i]);		
	}
    }
    public void clean() {
	this.model.setRowCount(0);
		
    }
    public void addRow(String[] row) {
	this.model.addRow(row);
		
    }
    
}

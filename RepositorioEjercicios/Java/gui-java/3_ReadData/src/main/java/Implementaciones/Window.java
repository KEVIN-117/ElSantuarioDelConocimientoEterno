
package Implementaciones;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 *
 * @author krodr
 */
public class Window extends JFrame implements Serializable{
    private JPanel panel;
    private JLabel lA, lB;
    
    private JTextField jtfA, jtfB;
    private JButton jbGenerar, showData;
    
    private JTextArea area, amountNumbers, reponse;
    private File file;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private JScrollPane scroll, scrollPane;
    public Window(Point point, Dimension dimension) throws HeadlessException {
        this.setTitle("Generar Numeros Primos");
        this.setSize(dimension);
        this.setLocation(point);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
        this.repaint();
        this.revalidate();
        loadWindow();
    }

    private void loadWindow() {
        panel = new JPanel();
        panel.setBounds(0, 0, 400,500);
        
        lA = new JLabel("A:");
        lA.setBounds(5,5, 20, 30);
        jtfA = new JTextField();
        jtfA.setBounds(20,5, 65, 30);
        lB = new JLabel("B:");
        lB.setBounds(90, 5, 20,30);
        jtfB = new JTextField();
        jtfB.setBounds(105, 5, 70, 30);
        jbGenerar = new JButton("Generar numeros Primos");
        jbGenerar.setBounds(185, 5, 190, 30);
        showData = new JButton("Mostrar todos los datos");
        showData.setBounds(185, 40, 190, 30);
        area = new JTextArea();
        area.setBounds(20, 40, 80, 400);
        area.setEditable(false);
        scroll = new JScrollPane(area, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setBounds(20, 40, 80, 400);
        
        amountNumbers = new JTextArea();
        amountNumbers.setBounds(115, 75, 260, 250);
        amountNumbers.setEditable(false);
        scrollPane = new JScrollPane(amountNumbers, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(115, 75, 260, 250);
        
        
        this.revalidate();
        this.repaint();
        panel.setLayout(null);
        this.panel.add(this.scroll);
        this.add(this.panel);
        this.panel.add(this.lA);
        this.panel.add(this.lB);
        this.panel.add(this.jtfA);
        this.panel.add(this.jtfB);
        this.panel.add(this.jbGenerar);
        
        this.panel.add(this.scrollPane);
        this.panel.add(this.showData);

        //accion boton
        file = new File("C:\\Users\\krodr\\Documents\\NetBeansProjects\\3_ReadData\\src\\main\\java\\Archivo.txt");
        showData.addActionListener((accion) ->{
            area.setText("");
            try {
                loadData(file);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        jbGenerar.addActionListener((acion) ->{
            ArrayList<Integer> numbers = new ArrayList<>();
            ArrayList<Integer> totalNumList = new ArrayList<>();
            reponse = new JTextArea();
            reponse.setBounds(115, 340, 260, 100);
            reponse.setFont(new Font("Georgia", 0, 15));
            reponse.setEditable(false);
            this.panel.add(this.reponse);
            this.area.setText("");
            int A = Integer.parseInt(jtfA.getText());
            int B = Integer.parseInt(jtfB.getText());
            for (int i = A; i <= B; i++) {
                int counter = 0;
                for (int j = 2; j < i; j++) {
                    if(i%j == 0){
                        counter++;
                    }
                }if(counter == 0){
                    totalNumList.add(i);
                }
                if(counter == 0 && numbers.size() <= 51 ){
                    numbers.add(i);
                    if(i==B){
                        break;
                    }
                }
            }
            String save = "";
            for (int i = 0; i < numbers.size(); i++) {
                int n = i+1;
                save += String.valueOf(numbers.get(i)+" ");
                area.append(String.valueOf(n + "-> " + numbers.get(i) + "\n "));
            }
            save +="\n<-----------NEW_LINE--------------------->\n";
            try {
                saveDataFile(file, save);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
            reponse.setText("Entre el numero "+ String.valueOf(A) + 
                                  " y el numero " + String.valueOf(B) + 
                                  "\n hay un total de  " +String.valueOf(totalNumList.size()) + " numeros :)\n pero solo se muestran " 
                                    + String.valueOf(numbers.size())+ "numeros");
            this.jtfA.setText("");
            this.jtfB.setText("");
        });
        
        
    }
    public void saveDataFile(File file, String user)throws Exception{
        fileWriter = new FileWriter(file, true);
        fileWriter.write(user);
        fileWriter.close();
    }

    
    public void loadData(File file)throws Exception{
        fileReader = new FileReader(file);
        bufferedReader = new BufferedReader(fileReader);
        String readLine = "";
        String temp = "";
        while((temp = bufferedReader.readLine()) != null){
            readLine += temp+"\n";
        }
        amountNumbers.setText(readLine.toString());
        fileReader.close();
        bufferedReader.close();
    }
}

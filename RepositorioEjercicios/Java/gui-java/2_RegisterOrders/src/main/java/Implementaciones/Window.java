/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementaciones;


import Implementaciones.LoadWindow.JButton;
import Implementaciones.LoadWindow.JLabel;
import Implementaciones.LoadWindow.JTable;
import Implementaciones.LoadWindow.JTextArea;
import Implementaciones.LoadWindow.JTextField;
import java.awt.Dimension;
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
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Window extends JFrame implements Serializable{
    private JButton btRegister, btSaveData, btShowData;
    private JLabel jlName, jlDetalle, jlTiempo;
    private JTextField jtfName, jtfTiempo;
    private JTextArea jtfDetalle;
    private JTextArea areTexto;
    private Orders user;
    private JTable table;
    private ArrayList<Orders> saveData;
    
    private File file;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    
    public Window(Point point, Dimension dimension) throws HeadlessException {
        this.saveData = new ArrayList<>();
        
        this.setTitle("Registrar Orders");
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
        loadButtons();
        loadLabels();
        loadTextFields();
        setTest();
    }

    private void loadLabels() {
        jlName = new JLabel("Nombre", new Point(50,50), new Dimension(60, 30));
        jlTiempo = new JLabel("Tiempo", new Point(50,80), new Dimension(60,30));
        jlDetalle = new JLabel("Detalle", new Point(50,110 ), new Dimension(70,30));
        
        
        this.add(this.jlName);
        this.add(this.jlDetalle);
        this.add(this.jlTiempo);
    }

    private void loadTextFields() {
        jtfName = new JTextField(new Point(100,50), new Dimension(150, 25));
        jtfTiempo = new JTextField(new Point(100, 80), new Dimension(150,25));
        jtfDetalle = new JTextArea(new Point(100,110), new Dimension(200, 50));
        
        this.repaint();
        this.revalidate();
        this.add(this.jtfName);
        this.add(this.jtfDetalle);
        this.add(this.jtfTiempo);
    }
    private void setTest() {
        areTexto = new JTextArea(new Point(10,225), new Dimension(350,350));
        this.revalidate();
        this.repaint();
        this.add(this.areTexto);
        
    }
    private void loadButtons() {
        btRegister = new JButton("Registrar", new Point(50, 180), new Dimension(90, 30));
        btSaveData = new JButton("Gurdar", new Point(145, 180), new Dimension(90,30));
        btShowData = new JButton("Mostrar datos", new Point(240,180), new Dimension(120,30));
        
        this.add(this.btRegister);
        this.add(this.btSaveData);
        this.add(this.btShowData);
        addEventButton();
    }

    private void addEventButton(){
        user = new Orders();
        file = new File("F:\\IdeaProjects\\InterfacesGraficasJava-GUI-\\2_RegisterOrders\\src\\main\\java\\Data.txt");
        btRegister.addActionListener((accion) ->{
            user.setNombreCliente(jtfName.getText());
            user.setDetalle(jtfDetalle.getText());
            user.setFechaDeEntraga(jtfTiempo.getText());
            this.saveData.add(user);
            
            jtfName.setText("");
            jtfDetalle.setText("");
            jtfTiempo.setText("");
       });
        
        btShowData.addActionListener((accion) ->{
            try {
                loadData(file);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        btSaveData.addActionListener((accion) ->{
            String addData = "";
            for (int i = 0; i < saveData.size(); i++) {
                addData += user.printData()+"\n";
                saveData.clear();
            }
            try {
                saveDataFile(file, addData);
            } catch (Exception ex) {
                Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
            }
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
        areTexto.setText(readLine);
        fileReader.close();
        bufferedReader.close();
    }
}
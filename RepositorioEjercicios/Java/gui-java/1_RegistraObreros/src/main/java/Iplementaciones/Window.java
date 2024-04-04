
package Iplementaciones;

import Iplementaciones.LoadWimdow.JButton;
import Iplementaciones.LoadWimdow.JLabel;
import Iplementaciones.LoadWimdow.JTextArea;
import Iplementaciones.LoadWimdow.JTextField;
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
import javax.swing.JOptionPane;

public class Window extends JFrame implements Serializable{
    private JButton btRegister, btSaveData, btShowData, btRegisterWorkingHours;
    private JLabel jlName, jlLastName, jlCi, jlHourBalance;
    private JTextField jtfName, jtfLAstName, jtfCi, jtfHourBalance;
    private JTextArea areTexto;
    private Data user;
    private ArrayList<Data> saveData;
    
    private File file;
    private FileWriter fileWriter;
    private BufferedReader bufferedReader;
    private FileReader fileReader;
    
    public Window(Point point, Dimension dimension) throws HeadlessException {
        this.saveData = new ArrayList<>();
        
        this.setTitle("Registrar Obrero");
        this.setSize(dimension);
        this.setLocation(point);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
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
        jlLastName = new JLabel("Apellido", new Point(50, 80), new Dimension(70,30));
        jlCi = new JLabel("Ci", new Point(50,110), new Dimension(20,30));
        jlHourBalance = new JLabel("Sueldo", new Point(50, 140), new Dimension(60, 30));
        
        
        this.add(this.jlName);
        this.add(this.jlLastName);
        this.add(this.jlCi);
        this.add(this.jlHourBalance);
    }

    private void loadTextFields() {
        jtfName = new JTextField(new Point(100,50), new Dimension(90, 25));
        jtfLAstName = new JTextField(new Point(100,80), new Dimension(90, 25));
        jtfCi = new JTextField(new Point(100, 110), new Dimension(70,25));
        jtfHourBalance = new JTextField(new Point(100, 140), new Dimension(35,25));
        this.repaint();
        this.revalidate();
        this.add(this.jtfName);
        this.add(this.jtfLAstName);
        this.add(this.jtfCi);
        this.add(this.jtfHourBalance);
        
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
        btRegisterWorkingHours = new JButton("Regitrar horas trabajadas", new Point(155,140), new Dimension(200,30));
        this.add(this.btRegister);
        this.add(this.btSaveData);
        this.add(this.btShowData);
        this.add(this.btRegisterWorkingHours);
        addEventButton();
    }

    private void addEventButton(){
        user = new Data();
        String currentDirectory = System.getProperty("user.dir")+"\\1_RegistraObreros\\src\\main\\java\\data";
        file = new File(currentDirectory+"\\Data.txt");
        btRegister.addActionListener((accion) ->{
            user.setNombre(jtfName.getText());
            user.setApellido(jtfLAstName.getText());
            user.setCi(Integer.parseInt(jtfCi.getText()));
            user.setSueldoHora(Integer.parseInt(jtfHourBalance.getText()));
            this.saveData.add(user);
            
            jtfName.setText("");
            jtfLAstName.setText("");
            jtfCi.setText("");
            jtfHourBalance.setText("");
       });
        
        btRegisterWorkingHours.addActionListener((accion ->{
             int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas que trabajo:"));
             user.setHorasTrbajadas(hora);
        }));
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

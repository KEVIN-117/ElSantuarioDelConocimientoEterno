package org.example.N_16Examples_SIS_211;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

public class Example_3 {
    public static void main(String[] args) {
        Window window = new Window(new Dimension(600, 400), new Point(0,0) , "REGISTER");
        window.repaint();
        window.revalidate();
    }
}

class Window extends JFrame{
    private JPanel panelWest;
    private JPanel panelCenter;
    private Button bListClient, lstMedicine, lstSale, registerClient, registerSales, registerMedicine;
    public Window(Dimension dimension, Point point, String title){
        this.setTitle(title);
        this.setSize(dimension);
        this.setLocation(point);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        panels();
        buttons();
    }
    public void panels(){
        panelWest = new JPanel();
        panelWest.setLayout(new GridLayout(6,1, 0, 5));
        panelWest.setBackground(Color.CYAN);
        this.panelCenter = new JPanel();
        this.panelCenter.setBackground(Color.BLACK);
        this.add(this.panelCenter, BorderLayout.CENTER);
        this.add(this.panelWest, BorderLayout.WEST);

    }
    public void buttons(){
        this.registerMedicine = new Button(
                "Register Medicine",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );
        this.registerClient = new Button(
                "Register Client",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );
        this.registerSales = new Button(
                "Register Sales",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );
        this.lstMedicine = new Button(
                "list Medicine",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );
        this.lstSale = new Button(
                "list sales",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );
        this.bListClient = new Button(
                "list clients",
                new Point(0,0),
                new Dimension(100,30),
                Color.BLUE
        );


        this.panelWest.add(this.registerMedicine);
        this.panelWest.add(this.registerClient);
        this.panelWest.add(this.registerSales);
        this.panelWest.add(this.lstMedicine);
        this.panelWest.add(this.lstSale);
        this.panelWest.add(this.bListClient);


        this.registerMedicine.addActionListener((item) ->{
            createComponet("registerMedicine");
        });
        this.registerClient.addActionListener((item) ->{
            createComponet("registerClient");
        });
        this.registerSales.addActionListener((item) ->{
            createComponet("registerSales");
        });

        this.lstMedicine.addActionListener((item) ->{
            createComponet("lstMedicine");
        });

        this.lstSale.addActionListener((item) -> {
            createComponet("lstSale");
        });
        this.bListClient.addActionListener((item) -> {
            createComponet("bListClient");
        });




    }
    private void cleanComponet(){
        if (panelCenter.getComponents().length > 0){
            Component component = panelCenter.getComponent(0);
            if (component != null){
                panelCenter.remove(component);
            }
        }
    }
    private void createComponet(String item) {
        Component component = null;
        switch (item){
            case "registerMedicine":{
                component = new  RegisterMedicine();
                break;
            }
            case "registerClient":{
                component = new RegisterClient();
                break;
            }
            case "registerSales":{
                component = new RegisterSales();
                break;
            }
            case "lstMedicine":{
                component = new ListMedicine();
                break;
            }
            case "lstSale":{
                component = new ListSales();
                break;
            } case "bListClient":{
                component = new ListClients();
                break;
            }


        }
        cleanComponet();
        this.panelCenter.add(component);
        this.revalidate();
        this.repaint();
    }

}

class ListMedicine extends JPanel{
    public ListMedicine( ){

        this.setLocation(15,15);
        this.setBackground(Color.GRAY);
        this.setSize(420, 350);
        loadDaa();
    }

    private void loadDaa() {
        JTextArea area = new JTextArea();
        area.setBounds(30,30,300,300);
        area.setText("public RegisterMedicine( ){\n" +
                "        this.setLocation(15,15);\n" +
                "        this.setBackground(Color.WHITE);\n" +
                "        this.setSize(420, 350);\n" +
                "        loadDaa();\n" +
                "    }");
        this.add(area);
    }
}

class ListSales extends JPanel{
    public ListSales( ){

        this.setLocation(15,15);
        this.setBackground(Color.GRAY);
        this.setSize(420, 350);
        loadDaa();
    }

    private void loadDaa() {
        JTextArea area = new JTextArea();
        area.setBounds(30,30,300,300);
        area.setText("public RegisterMedicine( ){\n" +
                "        this.setLocation(15,15);\n" +
                "        this.setBackground(Color.WHITE);\n" +
                "        this.setSize(420, 350);\n" +
                "        loadDaa();\n" +
                "    }");
        this.add(area);
    }
}

class ListClients extends JPanel{
    public ListClients( ){

        this.setLocation(15,15);
        this.setBackground(Color.GRAY);
        this.setSize(420, 350);
        loadDaa();
    }

    private void loadDaa() {
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable table = new JTable(tableModel);
        //table.setBounds(15,15,420,350);
        String[] headerTable = {"Code", "Id", "Name", "Last Name"};
        for (int i = 0; i < headerTable.length; i++) {
            tableModel.addColumn(headerTable[i]);
        }
        this.add(table);
        String[] Person = {"1890", "4567", "Kevin", "Alexis"};
        tableModel.addRow(Person);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(15,15,420,350);
        this.add(scrollPane);

    }
}



class RegisterMedicine extends JPanel{
    private  Management manager;
    public RegisterMedicine( ){
        this.setLocation(15,15);
        setSize(1000,50);
        this.setBackground(Color.WHITE);
        this.setSize(420, 350);
        this.setLayout(new GridLayout(2,1,0,10));
        loadDaa();
    }

    private void loadDaa() {
        JTextField jtNAme = new JTextField();
        jtNAme.setBounds(15, 50, 200, 30);
        jtNAme.setText("Enter her name of the medicine");
        jtNAme.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jtNAme.getText().equals("Enter her name of the medicine")){
                    jtNAme.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                jtNAme.setText("Enter her name of the medicine");
            }
        });


        JTextField jtPrice = new JTextField();
        jtPrice.setBounds(15, 50, 200, 30);
        jtPrice.setText("Enter her price of the medicine");
        jtPrice.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jtPrice.getText().equals("Enter her price of the medicine")){
                    jtPrice.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                jtPrice.setText("Enter her price of the medicine");
            }
        });

        Medicine registerMedicine = new Medicine(jtNAme.getText(), Integer.parseInt(jtPrice.getText()));
        this.manager.addMEdicine(registerMedicine);
        this.add(jtNAme);
        this.add(jtPrice);

    }
}

class RegisterClient extends JPanel{
    private Management manager;
    public RegisterClient( ){

        this.setLocation(15,15);
        this.setBackground(Color.GRAY);
        this.setSize(420, 350);
        loadDaa();
    }

    private void loadDaa() {
        JTextField jtNAme = new JTextField();
        jtNAme.setBounds(15, 50, 200, 30);
        jtNAme.setText("Enter her name of the medicine");
        jtNAme.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jtNAme.getText().equals("Enter her name of the medicine")){
                    jtNAme.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                jtNAme.setText("Enter her name of the medicine");
            }
        });


        JTextField jtPrice = new JTextField();
        jtPrice.setBounds(15, 50, 200, 30);
        jtPrice.setText("Enter her price of the medicine");
        jtPrice.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(jtPrice.getText().equals("Enter her price of the medicine")){
                    jtPrice.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                jtPrice.setText("Enter her price of the medicine");
            }
        });

        //Client client = new Client();
        //this.manager.addMEdicine(registerMedicine);
        this.add(jtNAme);
        this.add(jtPrice);

    }
}

class RegisterSales extends JPanel{
    public RegisterSales( ){
        this.setLocation(15,15);
        this.setBackground(Color.PINK);
        this.setSize(420, 350);
        loadDaa();
    }

    private void loadDaa() {
        JTextArea area = new JTextArea();
        area.setBounds(30,30,300,300);
        area.setText("public RegisterMedicine( ){\n" +
                "        this.setLocation(15,15);\n" +
                "        this.setBackground(Color.WHITE);\n" +
                "        this.setSize(420, 350);\n" +
                "        loadDaa();\n" +
                "    }");
        this.add(area);
    }
}

class Button extends JButton{
    public Button(String title, Point point, Dimension dimension, Color color){
        this.setText(title);
        this.setSize(dimension);
        this.setLocation(point);
        this.setBackground(color);
        this.setLayout(null);
    }
}
class Medicine{
    private String name;
    private Integer price;

    public Medicine(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
class Client{
    private String name;
    private String LastName;
    private Integer ci;
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Client(String name, String lastName, Integer ci, Integer code) {
        this.name = name;
        this.LastName = lastName;
        this.ci = ci;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Client(Integer ci){
        this.ci = ci;
    }

    public Integer getCi() {
        return ci;
    }

    public void setCi(Integer ci) {
        this.ci = ci;
    }
}


class Management{
    private ArrayList<Client> listClient;
    private ArrayList<Medicine> listMedicines;

    public Management() {
        this.listClient = new ArrayList<>();
        this.listMedicines = new ArrayList<>();
    }
    public void addMEdicine(Medicine name){
        this.listMedicines.add(name);
    }
    public void  addClient(Client client){
        this.listClient.add(client);
    }
    public Medicine getMEdicine(){
        Medicine medicine = null;
        for (Medicine item: this.listMedicines)
            medicine = item;
        return medicine;
    }

    public Client getClient(){
        Client client = null;
        for (Client item: this.listClient)
            client = item;
        return client;
    }

}

class Table extends JTable{
    private String[] column;
    private DefaultTableModel model;

    public Table(String[] column, Point point, Dimension dimension) {
        this.setSize(dimension);
        this.setLocation(point);
        this.column = column;
        this.model = (DefaultTableModel) this.getModel();
        this.setColunas();
    }

    private void setColunas() {
        for (int i = 0; i < this.column.length ; i++) {
            this.model.addColumn(this.column[i]);
        }
    }

    public void addRow(String[] row){
        this.model.addColumn(row);
    }
}

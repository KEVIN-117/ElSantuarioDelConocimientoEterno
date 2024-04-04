package org.jdbc.utils.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connector {
    private String url;
    private Connection connector;
    private Statement statement;
    private ResultSet resultSet;
    private String username;
    private String password;

    public Connector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.connector = null;
        this.statement = null;
        this.resultSet = null;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        try {
            this.connector = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Connection successful");
            this.statement = this.connector.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }

    }

    public void disconnect() {
        try {
            this.connector.close();
            System.out.println("Connection closed");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed to close");
        }
    }

    public void getTable(String table ){
        try {
            this.resultSet = this.statement.executeQuery("SELECT * FROM " + table);
            while(this.resultSet.next()){
                System.out.println( "Id: " + resultSet.getString("id") + "\nusername: " + resultSet.getString("username") + " \npassword: " + resultSet.getString("password") + "\n\n");
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed to close");
        }
    }
}

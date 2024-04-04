package org.jdbc.utils;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.*;

public class Connector {
    private String url;
    private Connection connection;
    private static Connector connector;
    private Statement statement;
    private ResultSet resultSet;
    private String username;
    private String password;

    private Connector(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.connection = null;
        this.statement = null;
        this.resultSet = null;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public static Connector getConnector() {
        return connector;
    }

    public static void setConnector(Connector connector) {
        Connector.connector = connector;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void connect() {
        try {
            this.connection = DriverManager.getConnection(this.url, this.username, this.password);
            System.out.println("Connection successful");
            this.statement = this.connection.createStatement();
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed");
        }

    }

    public void disconnect() {
        try {
            this.connection.close();
            System.out.println("Connection closed");
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection failed to close");
        }
    }


    /*public void createUser(String table, String username, String password, String email){
        PreparedStatement statement = null;
        String query = ("INSERT INTO " + table +" (name, email, password) VALUES (?, ?, ?)");
        try {
            statement = this.connection.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, email);
            statement.setString(3, password);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User created");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed Created User");
        }
    }*/
    public static Connector getInstance() throws SQLException {
        Dotenv dotenv = Dotenv.load();
        String uri = dotenv.get("URI");
        String user = dotenv.get("USER_NAME");
        String password = dotenv.get("PASSWORD");
        if (connector == null){
            connector = new Connector(uri, user, password);
        }
        return connector;
    }
}

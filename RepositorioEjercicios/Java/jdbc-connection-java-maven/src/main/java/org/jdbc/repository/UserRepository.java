package org.jdbc.repository;

import org.jdbc.models.User;
import org.jdbc.utils.Connector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {
    private Statement statement;
    private Connector connection;
    private ResultSet resultSet;

    public UserRepository() {
        this.connection = null;
        this.statement = null;
        this.resultSet = null;
    }

    private Connector connect() throws SQLException {
        return Connector.getInstance();
    }


    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            this.statement = this.connect().getConnection().createStatement();
            this.resultSet = this.statement.executeQuery("SELECT * FROM user");
            while(this.resultSet.next()) {
                User user = new User(this.resultSet.getString("id"),
                        this.resultSet.getString("name"),
                        this.resultSet.getString("email"),
                        this.resultSet.getString("password"));
                users.add(user);
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to get table");
        }
        return users;
    }

    @Override
    public User findById(String id) {
        User user = null;
        try {
            PreparedStatement statement = this.connect().getConnection().prepareStatement("SELECT * FROM user WHERE id = ?");
            statement.setString(1, id);
            this.resultSet = statement.executeQuery();
            if(this.resultSet.next()) {
                user = new User(this.resultSet.getString("id"),
                        this.resultSet.getString("name"),
                        this.resultSet.getString("email"),
                        this.resultSet.getString("password"));
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed to get table");
        }
        return user;
    }

    @Override
    public void save(User data) {
        PreparedStatement statement = null;
        String query = ("INSERT INTO user (id, name, email, password) VALUES (?, ?, ?, ?)");
        try {
            statement = this.connect().getConnection().prepareStatement(query);
            statement.setString(1, data.getId());
            statement.setString(2, data.getName());
            statement.setString(3, data.getEmail());
            statement.setString(4, data.getPassword());
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("User created");
                System.out.println(data);
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed Created User");
        }
    }

    @Override
    public void update(String id, User data) {

    }

    @Override
    public void delete(String id) {

    }
}

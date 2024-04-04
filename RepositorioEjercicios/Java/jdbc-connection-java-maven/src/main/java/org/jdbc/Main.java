package org.jdbc;

import io.github.cdimascio.dotenv.Dotenv;
import org.jdbc.utils.db.Connector;



public class Main {
    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        String uri = dotenv.get("URI");
        String user = dotenv.get("USER_NAME");
        String password = dotenv.get("PASSWORD");

        System.out.println(uri);
        System.out.println(user);
        System.out.println(password);
        Connector connector = new Connector(uri, user, password);
        connector.connect();
        connector.getTable("users");
    }
}
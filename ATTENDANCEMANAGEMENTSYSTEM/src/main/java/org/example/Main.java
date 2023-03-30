package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void connect(){
        connection connection= null;
        String url = "jdbc : sqlitesrc/main/java/org/example/Main.Javasrc/main/resources";
        try {
            connection = (org.example.connection) DriverManager.getConnection(url);
            System.out.println("connection established");

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        }


    }
}
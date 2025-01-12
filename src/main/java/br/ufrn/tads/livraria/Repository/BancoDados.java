package br.ufrn.tads.livraria.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";
    private static final String URL_DB = "jdbc:postgresql://localhost:5432/livraria";

    public BancoDados() {
    }

    public static Connection getConnection() {
        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/livraria", "postgres", "123");
            if (conexao != null) {
                System.out.println("Connected to database");
            }
        } catch (SQLException e) {
            System.out.println("Error when connecting...: " + String.valueOf(e));
        } catch (Exception e) {
            System.out.println("Error: " + String.valueOf(e));
        }

        return conexao;
    }
}

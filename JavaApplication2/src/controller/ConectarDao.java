/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.DriverManager; // Driver para abrir Conexão
import java.sql.SQLException; // Tratamento de Erros SQL
import java.sql.Connection;

/**
 *
 * @author pedro
 */
public class ConectarDao {

    private String url = "jdbc:mysql://localhost:3306/Hamburgueria";
    private String username = "root";
    private String password = "root";

    public Connection Conectar() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Conexão feita!");
            return connection;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}

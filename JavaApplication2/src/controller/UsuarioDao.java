/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Usuario;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author pedro
 */
public class UsuarioDao extends ConectarDao {

    public boolean fazerLogin(Usuario usuario) {
        String SQL = "SELECT * FROM ADMIN WHERE EMAIL = ?";

        try {
            Connection con = Conectar();

            PreparedStatement preparedStatement = con.prepareStatement(SQL);
            preparedStatement.setString(1, usuario.getUsername());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String email = resultSet.getString("email");
                String senha = resultSet.getString("senha");

                if (email.equals(usuario.getUsername()) && senha.equals(usuario.getSenha())) {
                    return true;
                }

            }
            con.close();
            return false;
            

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;

        }
    }

}

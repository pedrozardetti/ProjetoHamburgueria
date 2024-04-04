/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import model.Produto;

/**
 *
 * @author pedro
 */
public class ProdutoDao extends ConectarDao {

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS PRODUTO (id INT AUTO_INCREMENT PRIMARY KEY, NOME VARCHAR(50) NOT NULL, PRECO DOUBLE NOT NULL, DESCRICAO VARCHAR (255) NOT NULL)";

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.execute();
            System.out.println("Tabela criada com sucesso!");
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void adicionarProduto(Produto produto) {

        String sql = "INSERT INTO PRODUTO (NOME, PRECO, DESCRICAO) VALUES (?, ?, ?)";

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.execute();
            System.out.println("Inserido com sucesso!");
            con.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;

/**
 *
 * @author pedro
 */
public class ProdutoDao extends ConectarDao {

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS PRODUTO (id INT AUTO_INCREMENT PRIMARY KEY, NOME VARCHAR(50) NOT NULL, PRECO DOUBLE NOT NULL, DESCRICAO VARCHAR (255) NOT NULL, FOTO LONGBLOB NOT NULL)";

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

        String sql = "INSERT INTO PRODUTO (NOME, PRECO, DESCRICAO, FOTO) VALUES (?, ?, ?, ?)";

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setBlob(4, produto.getFoto());
            preparedStatement.execute();
            System.out.println("Inserido com sucesso!");
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível realizar o cadastro", "Erro de Operação",
                    JOptionPane.WARNING_MESSAGE);

        }

    }

    public List<Produto> listProduto() {
        String sql = "SELECT * FROM PRODUTO";

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double preco = resultSet.getDouble("preco");
                String descricao = resultSet.getString("descricao");

                produtos.add(new Produto(id, nome, preco, descricao, null, 0));
            }

            System.out.println("Sucesso em selecionar e colocar na lista!");
            return produtos;
        } catch (Exception e) {
            System.out.println("Erro em selecionar!");
            return Collections.emptyList();
        }
    }

    public Produto procurarProduto(Integer id) {
        String sql = "SELECT * FROM PRODUTO WHERE ID = ?";

        Produto produto = null;

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                produto = new Produto(resultSet.getInt("id"), resultSet.getString("nome"), resultSet.getDouble("preco"), resultSet.getString("descricao"), null, 0);

            }
            return produto;

        } catch (Exception e) {
            System.out.println("Falhou :(");
            return null;
        }

    }

    public void atualizarProduto(Integer id, String nome, double preco, String descricao) {
        String sql = "UPDATE PRODUTO SET NOME = ?, preco = ?, descricao = ? WHERE ID = ?";

        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setDouble(2, preco);
            preparedStatement.setString(3, descricao);
            preparedStatement.setInt(4, id);
            preparedStatement.execute();

            System.out.println("Update feito com sucesso!");
            con.close();
        } catch (Exception e) {
            System.out.println("Update não foi realizado!");
            return;
        }

    }
    
    public void deletarProduto(Integer id) {
        String sql = "DELETE FROM PRODUTO WHERE ID = ?";
        
        try {
            Connection con = Conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute(); 
            
            System.out.println("Produto foi deletado com sucesso!");
            con.close();
        } catch (Exception e) {
            System.out.println("Não foi possível deletar o produto!");
        }
        
    }
    
    
}

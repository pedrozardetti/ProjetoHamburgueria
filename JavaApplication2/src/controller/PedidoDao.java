/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Pedido;
import model.enums.TipoPedido;
/**
 *
 * @author pedro
 */
public class PedidoDao extends ConectarDao {

    public void ciarTabelaPedido() {
        String sql = "CREATE TABLE IF NOT EXISTS PEDIDO (ID INT AUTO_INCREMENT PRIMARY KEY, TOTAL DOUBLE NOT NULL, TIPO_PEDIDO ENUM('ANDAMENTO', 'CONCLUIDO') NOT NULL)";
        
        try {
            Connection connection = Conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.execute();
        } catch (Exception e) {
            System.out.println("Não foi possível criar a tabela pedido");
        }
    }
    
    
    public void insertPedido(Pedido pedido) {
        
        String sql = "INSERT INTO PEDIDO (TOTAL, TIPO_PEDIDO) VALUES (?, ?)";
        
        try {
            
            Connection connection = Conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setDouble(1, pedido.getTotal());
            preparedStatement.setString(2, pedido.getStatus().name());
            preparedStatement.execute();
            System.out.println("Insert feito com sucesso!");
            connection.close();
            
            
        } catch (Exception e) {
            System.out.println("Insert deu errado");
        }
        
    }
    
    public List<Pedido> selectPedidos() {
        
        String sql = "SELECT p.id, p.total, p.tipo_pedido FROM PEDIDO as p";
        
        try {
            List<Pedido> pedidos = new ArrayList<>();
            Connection connection = Conectar();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                double total = resultSet.getDouble("total");
                TipoPedido tipo = TipoPedido.valueOf(resultSet.getString("tipo_pedido"));
                
                pedidos.add(new Pedido(id, total, tipo));
                   
            }
            System.out.println("select ocorreu com sucesso");
            connection.close();
            return pedidos;
        } catch (Exception e) {
            System.out.println("Deu errado o select na tabela pedidos");
            return Collections.emptyList();
        }
        
        
    }
    
    public void updateSituacao(int id) {
        String sql = "UPDATE PEDIDO set TIPO_PEDIDO = 'CONCLUIDO' where id = ?";
        
        try {
            Connection connection = Conectar();
            
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Update realizado com sucesso");
            connection.close();
        } catch (Exception e) {
            System.out.println("Update falhaste!");
        }
    }
    
    
}

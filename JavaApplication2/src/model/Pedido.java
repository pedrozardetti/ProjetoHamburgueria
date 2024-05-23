/*
 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import model.enums.TipoPedido;

/**
 *
 
@author pedro*/
public final class Pedido {

    private int id;
    private double total;
    private TipoPedido status;
    private List<ItemProduto> produtos = new ArrayList<>();

    public Pedido() {
        this.status = TipoPedido.ANDAMENTO;
    }



    public Pedido(int id, double total, TipoPedido status) {
        this.id = id;
        this.total = total;
        this.status = status;

    }

    public Pedido(TipoPedido status, List<ItemProduto> produtos) {
        this.total = getTotal();
        this.status = status;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
    return produtos.stream()
                   .mapToDouble(ItemProduto::getPreco)
                   .sum();
}
    
    public double getTotalFromBd() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public TipoPedido getStatus() {
        return status;
    }

    public void setStatus(TipoPedido status) {
        this.status = status;
    }

    public List<ItemProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ItemProduto> produtos) {
        this.produtos = produtos;
    }




}
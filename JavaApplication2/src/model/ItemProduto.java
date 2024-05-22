/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pedro
 */
public class ItemProduto {

    private int id;
    private String nome;
    private double preco;
    private int id_produto;

    public ItemProduto(String nome, double preco, int id_produto) {
        this.nome = nome;
        this.preco = preco;
        this.id_produto = id_produto;
    }

    public ItemProduto(int id, String nome, double preco, int id_produto) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.id_produto = id_produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

}

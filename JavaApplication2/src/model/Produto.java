/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;

/**
 *
 * @author pedro
 */
public class Produto {

    private int id;
    private String nome;
    private double preco;
    private String descricao;
    private FileInputStream foto;
    private int tamanho;


    public Produto(int id, String nome, Double preco, String descricao, FileInputStream foto, int tamanho) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.foto = foto;
        this.tamanho = tamanho;
    }

    public Produto(String nome, Double preco, String descricao, FileInputStream foto, int tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.foto = foto;
        this.tamanho = tamanho;
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public FileInputStream getFoto() {
        return foto;
    }

    public void setFoto(FileInputStream foto) {
        this.foto = foto;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    

}

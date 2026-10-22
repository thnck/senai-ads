package com.thomas.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_produtos")
public class Produto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private double preco;


    // construtor sem parametros
    public Produto(){}


    // contrutor com parametros
    public Produto(long id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // getters e setters
    public long getId() {return id;}
    public void setId(long id){this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome){this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco){this.preco = preco;}

}

package com.thomas.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_fantasias")
public class Fantasia {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String tamanho;
    private double preco;
    private String faixaEtaria;


    // construtor sem parametros
    public Fantasia(){}


    // contrutor com parametros
    public Fantasia(Long id, String nome, String tamanho, double preco, String faixaEtaria){
        this.id = id;
        this.nome = nome;
        this.tamanho = tamanho;
        this.preco = preco;
        this.faixaEtaria = faixaEtaria;
    }

    // getters e setters
    public Long getId() {return id;}
    public void setId(Long id){this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public String getTamanho() {return tamanho;}
    public void setTamanho(String tamanho){this.tamanho = tamanho;}

    public double getPreco() {return preco;}
    public void setPreco(double preco){this.preco = preco;}
    
    public String getFaixaEtaria() {return faixaEtaria;}
    public void setFaixaEtaria(String faixaEtaria){this.faixaEtaria = faixaEtaria;}
    
    

}

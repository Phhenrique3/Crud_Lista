package com.example.crud_lista.model;

public class Produto {
    
    private Long  id ; 
    private String nome ;
    private String marca;
    private double  preco;
    

    public Produto() {}

    public Produto (Long id, String nome, String marca, double preco) {

        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public Long getId() {return id;}
    public void setId(Long id) { this.id = id; }

    public String getNome() {return nome; }
    public  void setNome(String nome) { this.nome = nome; }

    public String getMarca() {return marca;}
    public void  setMarca(String marca) {this.marca = marca;}

    
    public double getPreco() {return  preco;}
    public void  setPreco(double preco) {this.preco = preco;}


    
}

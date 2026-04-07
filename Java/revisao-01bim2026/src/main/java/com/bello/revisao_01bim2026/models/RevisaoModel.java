package com.bello.revisao_01bim2026.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_revisao")
public class RevisaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_revisao")
    private String nome;

    @Column(name = "preco_revisao")
    private double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}

package com.bello.employee.models;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PESSOA") //Personaliza o nome da tabela
public class PessoaModel {

    @Id //PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) //AUTO-INCREMENT id
    private Long id;
    private String nome;
    private String email;
    private int dataNascimento;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public PessoaModel(){

}

}


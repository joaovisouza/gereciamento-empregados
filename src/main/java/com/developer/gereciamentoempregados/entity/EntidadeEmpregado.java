package com.developer.gereciamentoempregados.entity;

import jakarta.persistence.*;


import java.util.Date;

@Entity
@Table(name = "mt_empregados")

public class EntidadeEmpregado{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "genero")
    private String genero;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "endereco")
    private String endereco;

    public EntidadeEmpregado(){}

    public EntidadeEmpregado(long id, String nome, String genero, Date dataNascimento, String endereco) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}


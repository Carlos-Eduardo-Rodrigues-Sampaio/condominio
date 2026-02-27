package com.senac.inicial.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "projeto")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projeto_id", nullable = false)
    private int id;
    @Column(name = "projeto_nome", nullable= false)
    private String nome;
    @Column(name = "projeto_status", nullable = false)
    private int status;

    @Transient
    private int empresaId;

    @Transient
    private String empresaNome;

    @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    @JsonIgnore
    private Empresa empresa;

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public int getEmpresaId() {
        return empresa.getId();
    }

    public String getEmpresaNome() {
        return empresa.getNome();
    }
}

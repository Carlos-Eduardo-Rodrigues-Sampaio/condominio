package com.senac.inicial.entity;

import jakarta.persistence.*;

@Entity
public class Projeto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projeto_id", nullable = false)
    private int id;
    @Column(name = "projeto_nome", nullable= false)
    private String nome;
    @Column(name = "projeto_status", nullable = false)
    private int status;





}

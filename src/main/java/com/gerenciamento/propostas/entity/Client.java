package com.gerenciamento.propostas.entity;

import javax.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "CLIENT_CPF")
    private String cpf;

    @Column(name = "CLIENT_SENHA")
    private String senha;

}

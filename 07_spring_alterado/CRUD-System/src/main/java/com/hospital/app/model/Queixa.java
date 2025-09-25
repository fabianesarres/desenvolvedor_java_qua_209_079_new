package com.hospital.app.model;

import javax.persistence.*;

@Entity
public class Queixa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private String prioridade; // Ex: "Alta", "Média", "Baixa"

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    // Getters e Setters
    // ...
}

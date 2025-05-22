package br.com.sprint3.odontoGuardJA.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_seq")
    @SequenceGenerator(name = "paciente_seq", sequenceName = "PACIENTE_SEQ", allocationSize = 1)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    private String telefone;
}

package br.com.etechoracio.Pw3_Study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISCIPLINA")

public class Disciplina {

    @Id
    @Column(name = "ID_DISCIPLINA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_disciplina;

    @Column(name = "TX_NOME")
    private String nome_disciplina;

}

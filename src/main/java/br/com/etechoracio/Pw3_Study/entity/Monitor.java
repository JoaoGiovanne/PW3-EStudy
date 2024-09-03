package br.com.etechoracio.Pw3_Study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TBL_MONITOR")

public class Monitor {

    @Id
    @Column(name = "ID_MONITOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_monitor;

    @Column(name = "TX_NOME")
    private String nome_monitor;

    @Column(name = "TX_FOTO")
    private String foto_monitor;

    @Column(name = "TX_WPP")
    private String whatsapp_monitor;

    @Column(name = "TX_EMAIL")
    private String email_monitor;

    @Column(name = "TX_CONTEUDO")
    private String conteudo_monitor;

    @ManyToOne
    @JoinColumn(name = "ID_DISCIPLINA")
    private Disciplina disciplina;

    @ManyToMany
    @JoinTable(name = "TBL_REL_MONITOR_DISPONIBILIDADE",
            joinColumns = @JoinColumn(name = "ID_MONITOR"),
            inverseJoinColumns = @JoinColumn(name = "ID_DISPONIBILIDADE")
    )
    private List<Disponibilidade> disponibilidades;
}

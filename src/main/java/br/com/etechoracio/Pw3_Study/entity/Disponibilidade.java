package br.com.etechoracio.Pw3_Study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {

    @Id
    @Column(name = "ID_DISPONIBILIDADE")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_disponibilidade;

    @Column(name = "TX_DIA_SEMANA")
    private String dia_semana;

    @Column(name = "DT_DAS")
    private LocalDateTime data_das;

    @Column(name = "DT_ATE")
    private LocalDateTime data_ate;

}

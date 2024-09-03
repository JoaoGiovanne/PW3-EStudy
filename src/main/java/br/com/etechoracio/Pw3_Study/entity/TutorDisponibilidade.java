package br.com.etechoracio.Pw3_Study.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

@Getter
@Setter
@Entity
@Table(name = "TBL_REL_TUTOR_DISPONIBILIDADE")

public class TutorDisponibilidade {

    @ManyToOne
    @JoinColumn(name = "ID_MONITOR")
    private TutorDisponibilidade id_monitor;

    @ManyToOne
    @JoinColumn(name = "ID_DISPONIBILIDADE")
    private TutorDisponibilidade id_disponibilidade;

}

package br.com.etechoracio.Pw3_Study.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MonitorResponseDTO {
    private Long id_monitor;
    private String nome_monitor;
    private String foto_monitor;
    private String whatsapp_monitor;
    private String email_monitor;
    private String conteudo_monitor;
}

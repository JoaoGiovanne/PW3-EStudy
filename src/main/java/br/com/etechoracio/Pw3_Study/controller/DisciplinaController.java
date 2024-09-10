package br.com.etechoracio.Pw3_Study.controller;

import br.com.etechoracio.Pw3_Study.Service.DisciplinaService;
import br.com.etechoracio.Pw3_Study.dto.DisciplinaResponseDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplina")

public class DisciplinaController {

    private DisciplinaService service;
    public List<DisciplinaResponseDTO> listar(){
        return service.listar();
    }

}

package br.com.etechoracio.Pw3_Study.controller;

import br.com.etechoracio.Pw3_Study.Service.DisciplinaService;
import br.com.etechoracio.Pw3_Study.dto.DisciplinaResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
@CrossOrigin(origins = "*")
public class DisciplinaController {

    @Autowired
    private DisciplinaService service;

    @GetMapping
    public List<DisciplinaResponseDTO> listar(){
        return service.listar();
    }

}

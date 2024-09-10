package br.com.etechoracio.Pw3_Study.Service;

import br.com.etechoracio.Pw3_Study.dto.DisciplinaResponseDTO;
import br.com.etechoracio.Pw3_Study.entity.Disciplina;
import br.com.etechoracio.Pw3_Study.repository.DisciplinaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    private ModelMapper modelMapeer = new ModelMapper();

    public List<DisciplinaResponseDTO> listar(){

        var disciplinas = repository.findAll();
        var resultado = disciplinas.stream().map(e-> modelMapeer.map(e, DisciplinaResponseDTO.class)).collect(Collectors.toList());
        return resultado;

    }

}

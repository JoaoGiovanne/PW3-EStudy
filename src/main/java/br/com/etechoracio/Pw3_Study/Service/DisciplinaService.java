package br.com.etechoracio.Pw3_Study.Service;

import br.com.etechoracio.Pw3_Study.entity.Disciplina;
import br.com.etechoracio.Pw3_Study.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository repository;

    public List<Disciplina> listar(){
        return repository.findAll();
    }

}

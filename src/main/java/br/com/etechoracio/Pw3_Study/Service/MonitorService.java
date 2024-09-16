package br.com.etechoracio.Pw3_Study.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.etechoracio.Pw3_Study.dto.MonitorResponseDTO;
import br.com.etechoracio.Pw3_Study.entity.Monitor;
import br.com.etechoracio.Pw3_Study.repository.MonitorRepository;

@Service
public class MonitorService {
    @Autowired
    private MonitorRepository repository;

    private ModelMapper modelMapper = new ModelMapper();

    public List<MonitorResponseDTO> listar(){
        var monitor = repository.findAll();
        var resultado = monitor.stream().map(e-> modelMapper.map(e, MonitorResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }

    public MonitorResponseDTO buscarPorId(Long id){
        Monitor monitor = repository.findById(id).orElseThrow(() -> 
        new ResponseStatusException(HttpStatus.NOT_FOUND, "não encontrado"));
        return modelMapper.map(monitor, MonitorResponseDTO.class);
    }
    
    public MonitorResponseDTO cadastrar(MonitorResponseDTO dto){
        Monitor monitor = modelMapper.map(dto, Monitor.class);
        monitor = repository.save(monitor);
        return modelMapper.map(monitor, MonitorResponseDTO.class);
    }

    public MonitorResponseDTO alterar(Long id, MonitorResponseDTO dto){
        Monitor monitorExiste = repository.findById(id).orElseThrow(() -> 
        new ResponseStatusException(HttpStatus.NOT_FOUND, "não encontrado"));
        modelMapper.map(dto, monitorExiste);
        monitorExiste = repository.save(monitorExiste);
        return modelMapper.map(monitorExiste, MonitorResponseDTO.class);
    }

    public void excluir(Long id){
        Monitor monitor = repository.findById(id).orElseThrow(() -> 
        new ResponseStatusException(HttpStatus.NOT_FOUND, "não encontrado"));
        repository.delete(monitor);
    }

}

package br.com.etechoracio.Pw3_Study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etechoracio.Pw3_Study.Service.MonitorService;
import br.com.etechoracio.Pw3_Study.dto.MonitorResponseDTO;

@RestController
@RequestMapping("/monitor")

public class MonitorController {
    
    @Autowired
    private MonitorService service;

    @GetMapping
    public List<MonitorResponseDTO> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MonitorResponseDTO> buscarPorId(@PathVariable Long id) {
        MonitorResponseDTO monitor = service.buscarPorId(id);
        return ResponseEntity.ok(monitor);
    }

    @PostMapping
    public ResponseEntity<MonitorResponseDTO> cadastrar(@RequestBody MonitorResponseDTO dto) {
        MonitorResponseDTO monitor = service.cadastrar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(monitor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonitorResponseDTO> alterar(@PathVariable Long id, @RequestBody MonitorResponseDTO dto) {
        MonitorResponseDTO monitor = service.alterar(id, dto);
        return ResponseEntity.ok(monitor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}

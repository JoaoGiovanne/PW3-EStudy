package br.com.etechoracio.Pw3_Study.controller;

import jakarta.servlet.annotation.HttpMethodConstraint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.etechoracio.Pw3_Study.Service.MonitorService;
import br.com.etechoracio.Pw3_Study.dto.MonitorResponseDTO;

import java.util.List;

@RestController
@RequestMapping("/monitor")
@CrossOrigin(origins = "*")
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

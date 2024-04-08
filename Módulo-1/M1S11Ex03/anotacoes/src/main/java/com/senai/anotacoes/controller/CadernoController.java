package com.senai.anotacoes.controller;

import com.senai.anotacoes.entity.CadernoEntity;
import com.senai.anotacoes.service.CadernoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadernos")
public class CadernoController {

    private final CadernoService cadernoService;

    public CadernoController(CadernoService cadernoService) {
        this.cadernoService = cadernoService;
    }

    @GetMapping
    public ResponseEntity<List<CadernoEntity>> get() {
        return ResponseEntity.ok(cadernoService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<CadernoEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(cadernoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<CadernoEntity> post(@RequestBody CadernoEntity caderno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cadernoService.criar(caderno));
    }

    @PutMapping("{id}")
    public ResponseEntity<CadernoEntity> put(@PathVariable Long id, @RequestBody CadernoEntity caderno) {
        return ResponseEntity.ok(cadernoService.alterar(id, caderno));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        cadernoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

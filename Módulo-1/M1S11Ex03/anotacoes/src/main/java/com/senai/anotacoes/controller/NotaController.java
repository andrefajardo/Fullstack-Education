package com.senai.anotacoes.controller;

import com.senai.anotacoes.entity.NotaEntity;
import com.senai.anotacoes.service.NotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("notas")
public class NotaController {

    private final NotaService notaService;

    public NotaController(NotaService notaService) {
        this.notaService = notaService;
    }

    @GetMapping
    public ResponseEntity<List<NotaEntity>> get() {
        return ResponseEntity.ok(notaService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<NotaEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(notaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<NotaEntity> post(@RequestBody NotaEntity nota) {
        return ResponseEntity.status(HttpStatus.CREATED).body(notaService.criar(nota));
    }

    @PutMapping("{id}")
    public ResponseEntity<NotaEntity> put(@PathVariable Long id, @RequestBody NotaEntity nota) {
        return ResponseEntity.ok(notaService.alterar(id, nota));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        notaService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

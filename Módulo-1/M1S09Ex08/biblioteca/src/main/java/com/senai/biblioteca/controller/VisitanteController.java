package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.VisitanteEntity;
import com.senai.biblioteca.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitanteService;

    @PostMapping()
    public VisitanteEntity post(@RequestBody VisitanteEntity visitanteEntity) {
        return visitanteService.salvar(visitanteEntity);
    }
    @GetMapping()
    public List<VisitanteEntity> get() {
        return visitanteService.listarTodos();
    }
    @GetMapping("{id}")
    public VisitanteEntity getId(@PathVariable Long id) throws Exception {
        return visitanteService.buscarPorId(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        visitanteService.apagar(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateVisitante(@PathVariable("id") Long id, @RequestParam(name = "nome", required = false) String nome
    ) {
        visitanteService.updateVisitante(id, nome);
        return ResponseEntity.noContent().build();
    }
}


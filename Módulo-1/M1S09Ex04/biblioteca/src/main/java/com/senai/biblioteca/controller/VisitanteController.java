package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.VisitanteEntity;
import com.senai.biblioteca.services.VisitanteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService visitantesService;

    @PostMapping()
    public VisitanteEntity post(@RequestBody VisitanteEntity visitanteEntity) {
        return visitantesService.salvar(visitanteEntity);
    }
    @GetMapping()
    public List<VisitanteEntity> get() {
        return visitantesService.listarTodos();
    }
}


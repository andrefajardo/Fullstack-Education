package com.senai.fullstack.education.tutoria.controllers;


import com.senai.fullstack.education.tutoria.entities.MaterialEntity;
import com.senai.fullstack.education.tutoria.services.MaterialService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("materiais")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @GetMapping
    public ResponseEntity<List<MaterialEntity>> get() {
        return ResponseEntity.ok(materialService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<MaterialEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(materialService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<MaterialEntity> post(@RequestBody MaterialEntity material) {
        return ResponseEntity.status(HttpStatus.CREATED).body(materialService.criar(material));
    }

    @PutMapping("{id}")
    public ResponseEntity<MaterialEntity> put(@PathVariable Long id, @RequestBody MaterialEntity material) {
        return ResponseEntity.ok(materialService.alterar(id, material));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        materialService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

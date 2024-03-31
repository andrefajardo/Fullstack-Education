package com.senai.fullstack.education.tutoria.controllers;


import com.senai.fullstack.education.tutoria.entities.TutorEntity;
import com.senai.fullstack.education.tutoria.services.TutorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tutores")
public class TutorController {

    private final TutorService tutorService;

    public TutorController(TutorService tutorService) {
        this.tutorService = tutorService;
    }

    @GetMapping
    public ResponseEntity<List<TutorEntity>> get() {
        return ResponseEntity.ok(tutorService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<TutorEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(tutorService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<TutorEntity> post(@RequestBody TutorEntity tutor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(tutorService.criar(tutor));
    }

    @PutMapping("{id}")
    public ResponseEntity<TutorEntity> put(@PathVariable Long id, @RequestBody TutorEntity tutor) {
        return ResponseEntity.ok(tutorService.alterar(id, tutor));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutorService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

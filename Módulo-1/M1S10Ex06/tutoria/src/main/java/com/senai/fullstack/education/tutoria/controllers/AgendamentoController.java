package com.senai.fullstack.education.tutoria.controllers;


import com.senai.fullstack.education.tutoria.entities.AgendamentoEntity;
import com.senai.fullstack.education.tutoria.services.AgendamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("agendamentos")
public class AgendamentoController {

    private final AgendamentoService agendamentoService;

    public AgendamentoController(AgendamentoService agendamentoService) {
        this.agendamentoService = agendamentoService;
    }

    @GetMapping
    public ResponseEntity<List<AgendamentoEntity>> get() {
        return ResponseEntity.ok(agendamentoService.buscarTodos());
    }

    @GetMapping("{id}")
    public ResponseEntity<AgendamentoEntity> getId(@PathVariable Long id) {
        return ResponseEntity.ok(agendamentoService.buscarPorId(id));
    }

    @GetMapping("/aluno-id/{alunoId}")
    public ResponseEntity<List<AgendamentoEntity>> getAlunoId(@PathVariable Long alunoId) {
        return ResponseEntity.ok(agendamentoService.buscarPorAlunoId(alunoId));
    }
    @GetMapping("/tutor-id/{tutorId}")
    public ResponseEntity<List<AgendamentoEntity>> getTutorId(@PathVariable Long tutorId) {
        return ResponseEntity.ok(agendamentoService.buscarPorTutorId(tutorId));
    }

    @PostMapping
    public ResponseEntity<AgendamentoEntity> post(@RequestBody AgendamentoEntity agenda) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamentoService.criar(agenda));
    }

    @PutMapping("{id}")
    public ResponseEntity<AgendamentoEntity> put(@PathVariable Long id, @RequestBody AgendamentoEntity agenda) {
        return ResponseEntity.ok(agendamentoService.alterar(id, agenda));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        agendamentoService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}

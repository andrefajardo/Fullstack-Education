package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.BibliotecarioEntity;
import com.senai.biblioteca.services.BibliotecarioService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping()
    public BibliotecarioEntity post(@RequestBody BibliotecarioEntity bibliotecario) throws Exception {
        return bibliotecarioService.salvar(bibliotecario);
    }
    @GetMapping()
    public List<BibliotecarioEntity> get() {
        return bibliotecarioService.listarTodos();
    }
    @GetMapping("{id}")
    public BibliotecarioEntity getId(@PathVariable Long id) throws Exception {
        return bibliotecarioService.buscarPorId(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> apagar(@PathVariable Long id) throws Exception {
        bibliotecarioService.apagar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateBibliotecario(@PathVariable("id") Long id,
                                                    @RequestParam(name = "nome", required = false) String nome
    ) {
        bibliotecarioService.updateBibliotecario(id, nome);
        return ResponseEntity.noContent().build();
    }
}
package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.LivroEntity;
import com.senai.biblioteca.services.LivroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroService livroService;

    @PostMapping()
    public LivroEntity post(@RequestBody LivroEntity livro) throws Exception {
        return livroService.salvar(livro);
    }
    @GetMapping()
    public List<LivroEntity> get() {
        return livroService.listarTodos();
    }
    @GetMapping("{id}")
    public LivroEntity getId(@PathVariable Long id) throws Exception {
        return livroService.buscarPorId(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        livroService.apagar(id);
        return ResponseEntity.noContent().build();
    }
}
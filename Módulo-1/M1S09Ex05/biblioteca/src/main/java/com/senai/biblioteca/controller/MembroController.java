package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.LivroEntity;
import com.senai.biblioteca.entities.MembroEntity;
import com.senai.biblioteca.services.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membros")
@RequiredArgsConstructor
public class MembroController {

    private final MembroService membroService;

    @PostMapping()
    public MembroEntity post(@RequestBody MembroEntity membroEntity) {
        return membroService.salvar(membroEntity);
    }
    @GetMapping()
    public List<MembroEntity> get() throws Exception {
        return membroService.listarTodos();
    }
    @GetMapping("{id}")
    public MembroEntity getId(@PathVariable Long id) throws Exception {
        return membroService.buscarPorId(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> apagar(@PathVariable Long id) throws Exception {
        membroService.apagar(id);
        return ResponseEntity.noContent().build();
    }
}

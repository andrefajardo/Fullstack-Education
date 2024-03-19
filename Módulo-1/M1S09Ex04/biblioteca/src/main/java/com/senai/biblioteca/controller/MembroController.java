package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.MembroEntity;
import com.senai.biblioteca.services.MembroService;
import lombok.RequiredArgsConstructor;
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
    public List<MembroEntity> get() {
        return membroService.listarTodos();
    }
}

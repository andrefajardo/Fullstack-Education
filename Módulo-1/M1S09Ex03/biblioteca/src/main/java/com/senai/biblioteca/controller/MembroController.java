package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.MembroEntity;
import com.senai.biblioteca.services.MembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/membros")
@RequiredArgsConstructor
public class MembroController {

    private final MembroService membroService;

    @PostMapping()
    public MembroEntity post(@RequestBody MembroEntity membroEntity) {
        return membroService.salvar(membroEntity);
    }
}

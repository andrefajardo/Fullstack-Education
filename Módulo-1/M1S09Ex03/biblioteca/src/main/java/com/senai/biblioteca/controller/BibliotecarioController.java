package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.BibliotecarioEntity;
import com.senai.biblioteca.services.BibliotecarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bibliotecarios")
@RequiredArgsConstructor
public class BibliotecarioController {

    private final BibliotecarioService bibliotecarioService;

    @PostMapping()
    public BibliotecarioEntity post(@RequestBody BibliotecarioEntity bibliotecario) throws Exception {
        return bibliotecarioService.salvar(bibliotecario);
    }

}
package com.senai.anotacoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class TesteController {

    @GetMapping("/get")
    String GetTest() {
        return "<h1>Public route, teste Get 🔓 </h1>";
    }

    @PostMapping
    String PostTest() {
        return "<h1>Public route, teste Post 🔓 </h1>";
    }
    @DeleteMapping
    String DeleteTest() {
        return "<h1>Public route, teste Delete 🔓 </h1>";
    }
    @PutMapping
    String PutTest() {
        return "<h1>Public route, teste Put 🔓 </h1>";
    }
}


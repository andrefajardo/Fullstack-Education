package com.senai.anotacoes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class UsuarioController {

    @GetMapping("/public")
    String publicRoute() {
        return "<h1>Public route, feel free to look around! 🔓 </h1>";
    }

    @GetMapping("/private")
    String privateRoute() {
        return ("""
				<h1>Private route, only authorized personal! 🔐  </h1>
				""");
    }

    @GetMapping("/private2")
    String privateRoute2() {
        return ("""
				<h1>Private2 route, only authorized personal! 🔐  </h1>
				""");
    }

}

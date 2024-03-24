package com.senai.biblioteca.controller;

import com.senai.biblioteca.entities.EmprestimoEntity;
import com.senai.biblioteca.services.EmprestimoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/emprestimos")
@RequiredArgsConstructor
public class EmprestimoController {

    private final EmprestimoService emprestimoService;

    @PostMapping()
    public EmprestimoEntity post(@RequestBody EmprestimoEntity emprestimo) throws Exception {
        return emprestimoService.salvar(emprestimo);
    }
    @GetMapping()
    public List<EmprestimoEntity> get() {
        return emprestimoService.listarTodos();
    }
    @GetMapping("{id}")
    public EmprestimoEntity getId(@PathVariable Long id) throws Exception {
        return emprestimoService.buscarPorId(id);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) throws Exception {
        emprestimoService.apagar(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> updateEmprestimo(@PathVariable("id") Long id, @RequestParam(name = "dataDevolucao", required = false) LocalDate dataDevolucao
    ) {
        emprestimoService.updateEmprestimo(id, dataDevolucao);
        return ResponseEntity.noContent().build();
    }
}
package br.com.fullstack.education.controllers;

import br.com.fullstack.education.models.ProfessorModel;
import br.com.fullstack.education.services.CursoProfessorService;
import br.com.fullstack.education.services.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("professores")
public class ProfessorController {

    private final CursoProfessorService professorService;

    public ProfessorController(CursoProfessorService professorService) {
        this.professorService = professorService;
    }


    /** Buscar (todos) */
    @GetMapping
    public List<ProfessorModel> get() {
        return professorService.buscarTodos();
    }

    /** Buscar por id */
    @GetMapping("{id}")
    public ProfessorModel getId(@PathVariable Integer id) throws Exception{
        return professorService.buscarId(id);
    }

    /** Criar */
    @PostMapping()
    public ProfessorModel post(@RequestBody ProfessorModel professor) throws Exception{
        return professorService.salvar(professor);
    }

    /** Editar */
    @PutMapping("{id}")
    public ProfessorModel put(@PathVariable Integer id, @RequestBody ProfessorModel professor) throws Exception{
        return professorService.salvar(id, professor);
    }

    /** Deletar */
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return professorService.removerProfessor(id);
    }


//    Método GET passando o parâmetro na linha da requisição do browser (http://localhost:8080/professores?id=90) p.ex
//    @GetMapping
//    public String getIdParam(Integer id) {
//        return "GET /Professores passando o ID em linha do request:  (" + id + ")";
//    }



}

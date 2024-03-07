package br.com.fullstack.education.controllers;

import br.com.fullstack.education.models.CursoModel;
import br.com.fullstack.education.models.ProfessorModel;
import br.com.fullstack.education.services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


    /** Buscar (todos) */
    @GetMapping
    public List<CursoModel> get() {
        return cursoService.buscarTodos();
    }

    /** Buscar por id */
    @GetMapping("{id}")
    public CursoModel getId(@PathVariable Integer id) throws Exception{
        return cursoService.buscarId(id);
    }

    /** Criar */
    @PostMapping()
    public CursoModel post(@RequestBody CursoModel curso) throws Exception{
        return cursoService.salvar(curso);
    }

    /** Editar */
    @PutMapping("{id}")
    public CursoModel put(@PathVariable Integer id, @RequestBody CursoModel curso) throws Exception{
        return cursoService.salvar(id, curso);
    }

    /** Deletar */
    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) throws Exception {
        return cursoService.excluir(id);
    }

    /** Vincular professor a um curso */
    @PostMapping("{cursoId}/add-professor")
    public CursoModel postProfessor (@PathVariable Integer cursoId, @RequestBody ProfessorModel professor) throws Exception{
        return cursoService.vincularProfessor(cursoId, professor.getId());
    }

    @PostMapping("{cursoId}/add-professor/{professorId}")
    public CursoModel postProfessorId (@PathVariable Integer cursoId, @PathVariable Integer professorId) throws Exception{
        return cursoService.vincularProfessor(cursoId, professorId);
    }


//    Método GET passando o parâmetro na linha da requisição do browser (http://localhost:8080/cursos?id=90) p.ex
//    @GetMapping
//    public String getIdParam(Integer id) {
//        return "GET /Cursos passando o ID em linha do request:  (" + id + ")";
//    }



}

package br.com.school.administration.schoolAdministration.Controllers;


import br.com.school.administration.schoolAdministration.Models.AlunoModel;
import br.com.school.administration.schoolAdministration.Models.CursoModel;
import br.com.school.administration.schoolAdministration.Services.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }


    @GetMapping()
    public List<CursoModel> get() {
        return cursoService.listarCursos();
    }
    @PostMapping()
    public CursoModel post(@RequestBody CursoModel curso) throws Exception {
        return cursoService.salvar(curso);
    }
    @PostMapping("{cursoId}/add-aluno")
    public CursoModel post(@PathVariable Integer cursoId, @RequestBody AlunoModel aluno) throws Exception {
        return cursoService.matricular(cursoId, aluno.getId());
    }

}

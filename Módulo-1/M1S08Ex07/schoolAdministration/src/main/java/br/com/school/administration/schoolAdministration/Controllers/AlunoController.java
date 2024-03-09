package br.com.school.administration.schoolAdministration.Controllers;


import br.com.school.administration.schoolAdministration.Models.AlunoModel;
import br.com.school.administration.schoolAdministration.Services.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }


    @GetMapping("{id}")
    public List<AlunoModel> get() {
        return alunoService.buscarTodos();
    }
    @PostMapping("{id}")
    public AlunoModel post(@RequestBody AlunoModel aluno) throws Exception {
        return alunoService.salvar(aluno);
    }

}

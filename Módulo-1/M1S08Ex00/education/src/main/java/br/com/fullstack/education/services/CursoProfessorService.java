package br.com.fullstack.education.services;

import br.com.fullstack.education.models.CursoModel;
import br.com.fullstack.education.models.ProfessorModel;
import org.springframework.stereotype.Service;

@Service
public class CursoProfessorService extends ProfessorService {
    private final CursoService cursoService;


    public CursoProfessorService(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    public boolean removerProfessor (Integer id) throws Exception {
        ProfessorModel professor = buscarId(id);
        for (CursoModel curso : cursoService.buscarTodos()) {
            curso.getProfessores().remove(professor);
        }
        return excluir(professor);
    }
}

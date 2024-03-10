package br.com.school.administration.schoolAdministration.Services;

import br.com.school.administration.schoolAdministration.Models.AlunoModel;
import br.com.school.administration.schoolAdministration.Models.CursoModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    private final AlunoService alunoService;

    public CursoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public List<CursoModel> listarCursos() {
        return CursoModel.getCursos();
    }
    public CursoModel salvar(CursoModel curso) throws Exception {
        if (validar(curso)){
           return CursoModel.inserir(curso);
        }
        return curso;
    }

    public CursoModel matricular(Integer cursoId, Integer alunoId) throws Exception {
        CursoModel curso = buscarId(cursoId);
        AlunoModel aluno = alunoService.buscarId(alunoId);
        CursoModel.matricular(curso, aluno);
        return curso;
    }

    public CursoModel buscarId(Integer id) throws Exception {
        return CursoModel.buscarId(id);
    }
    private boolean validar(CursoModel curso) throws Exception {
        if (curso.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório");
        }
        if (curso.getDescricao().isBlank()) {
            throw new Exception("Descrição é obrigatório");
        }
        if (curso.getCargaHoraria() == null) {
            throw new Exception("Data de nascimento é obrigatório");
        }
        return true;
    }
}

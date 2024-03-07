package br.com.fullstack.education.services;

import br.com.fullstack.education.models.CursoModel;
import br.com.fullstack.education.models.ProfessorModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final ProfessorService professorService;

    public CursoService(ProfessorService professorService) {
        this.professorService = professorService;
    }

    public CursoModel salvar(CursoModel curso) throws Exception{
        if (validar(curso)) { // ** INCLUSÃO **
            return CursoModel.inserir(curso);
        }
        return null;
    }

    public CursoModel salvar(Integer id, CursoModel curso) throws Exception{
        if (validar(curso)) { // ** EDIÇÃO **
            CursoModel cadastrado = buscarId(id);
            cadastrado.setNome(curso.getNome());
            cadastrado.setDescricao(curso.getDescricao());
            cadastrado.setCargaHoraria(curso.getCargaHoraria());
            return cadastrado;
        }
        return null;
    }

    public boolean excluir (Integer id) throws Exception {
        CursoModel curso = buscarId(id);
        return CursoModel.excluir(curso);
    }
    private boolean validar (CursoModel curso) throws Exception{
        if (curso.getNome().isBlank()){
            throw new Exception("Nome precisar ser informado.");
        }
        if (curso.getCargaHoraria() < 100 || curso.getCargaHoraria() == null){
            throw new Exception("Carga horária insuficiênte ou não informada.");
        }
        return true;
    }

    public List<CursoModel> buscarTodos () {
        return CursoModel.getCursosCadastrados();
    }
    public CursoModel buscarId (Integer id) throws Exception{
        return CursoModel.buscarId(id);
    }

    public CursoModel vincularProfessor (Integer cursoId, Integer professorId) throws Exception {
        CursoModel curso = buscarId(cursoId);
        ProfessorModel professor = professorService.buscarId(professorId);
        CursoModel.adicionarProfessor(curso, professor);
        return curso;
    }
}

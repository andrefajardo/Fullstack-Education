package br.com.fullstack.education.services;

import br.com.fullstack.education.models.ProfessorModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {


    public ProfessorModel salvar(ProfessorModel professor) throws Exception{
        if (validar(professor)) { // ** INCLUSÃO **
            return ProfessorModel.inserir(professor);
        }
        return null;
    }

    public ProfessorModel salvar(Integer id, ProfessorModel professor) throws Exception{
        if (validar(professor)) { // ** EDIÇÃO **
            ProfessorModel cadastrado = buscarId(id);
            cadastrado.setNome(professor.getNome());
            cadastrado.setEspecialidade(professor.getEspecialidade());
            return cadastrado;
        }
        return null;
    }

    public boolean excluir (Integer id) throws Exception {
        ProfessorModel professor = buscarId(id);
        return excluir(professor);
    }
    public boolean excluir (ProfessorModel professor) throws Exception {
        return ProfessorModel.excluir(professor);
    }

    private boolean validar (ProfessorModel professor) throws Exception{
        if (professor.getNome().isBlank()){
            throw new Exception("Nome precisar ser informado.");
        }
        if (professor.getEspecialidade().isBlank()){
            throw new Exception("Especialidade precisar ser informada.");
        }
        return true;
    }

    public List<ProfessorModel> buscarTodos () {
        return ProfessorModel.getProfessoresCadastrados();
    }
    public ProfessorModel buscarId (Integer id) throws Exception{
        return ProfessorModel.buscarId(id);
    }
}

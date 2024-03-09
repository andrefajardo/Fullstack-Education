package br.com.school.administration.schoolAdministration.Services;

import br.com.school.administration.schoolAdministration.Models.CursoModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    public List<CursoModel> listarCursos() {
        return CursoModel.getCursos();
    }
    public CursoModel salvar(CursoModel curso) throws Exception {
        if (validar(curso)){
           return CursoModel.inserir(curso);
        }
        return curso;
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

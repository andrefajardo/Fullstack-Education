package br.com.school.administration.schoolAdministration.Services;

import br.com.school.administration.schoolAdministration.Models.AlunoModel;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlunoService {

    public List<AlunoModel> buscarTodos() {
        return AlunoModel.getAlunos();
    }
    public AlunoModel salvar (AlunoModel aluno) throws Exception {
        if (validar(aluno)) {
            return AlunoModel.inserir(aluno);
        }
        return null;
    }
    private boolean validar(AlunoModel aluno) throws Exception {
        if (aluno.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório");
        }

        if (aluno.getDataNascimento() == null) {
            throw new Exception("Data de nascimento é obrigatório");
        }

        return true;
    }
}

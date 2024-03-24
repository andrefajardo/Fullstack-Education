package com.senai.biblioteca.services;

import com.senai.biblioteca.entities.EmprestimoEntity;
import com.senai.biblioteca.repository.EmprestimoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmprestimoService {

    private final EmprestimoRepository emprestimoRepository;

    public EmprestimoService(EmprestimoRepository emprestimoRepository) {
        this.emprestimoRepository = emprestimoRepository;
    }

    public EmprestimoEntity salvar (EmprestimoEntity emprestimo) {
        return emprestimoRepository.save(emprestimo);
    }

    public List<EmprestimoEntity> listarTodos() {
        return emprestimoRepository.findAll();
    }

    public EmprestimoEntity buscarPorId(Long id) throws Exception {
        return emprestimoRepository.findById(id).orElseThrow(() -> new Exception("Emprestimo não encontrado"));
    }

    public void apagar(Long id) throws Exception {
        EmprestimoEntity entity = buscarPorId(id);
        emprestimoRepository.delete(entity);
    }

    public void updateEmprestimo(Long id, LocalDate dataDevolucao) {
        emprestimoRepository.updateDataDevolucaoById(id,dataDevolucao);
    }
}

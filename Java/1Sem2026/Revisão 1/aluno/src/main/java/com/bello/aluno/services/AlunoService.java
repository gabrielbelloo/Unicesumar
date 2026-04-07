package com.bello.aluno.services;

import com.bello.aluno.models.AlunoModel;
import com.bello.aluno.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public AlunoModel add(AlunoModel alunoModel){
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> listar(){
        return alunoRepository.findAll();
    }

    public AlunoModel buscar(Long id) {
        return alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }

    public void deletar(Long id) {
        if (!alunoRepository.existsById(id)){
            throw new RuntimeException("Aluno não encontrado");
        }
        alunoRepository.deleteById(id);
    }

    public AlunoModel atualizar(Long id, AlunoModel alunoModel){
        AlunoModel model = alunoRepository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));

        model.setNome(alunoModel.getNome());
        model.setPreco(alunoModel.getPreco());

        return alunoRepository.save(model);
    }
}
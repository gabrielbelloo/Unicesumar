package com.bello.revisao_01bim2026.services;

import com.bello.revisao_01bim2026.models.RevisaoModel;
import com.bello.revisao_01bim2026.repositories.RevisaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RevisaoService {

    @Autowired
    RevisaoRepository revisaoRepository;

    public RevisaoModel add(RevisaoModel revisaoModel){
        return revisaoRepository.save(revisaoModel);
    }

    public List<RevisaoModel> listar(){
        return revisaoRepository.findAll();
    }

    public Optional<RevisaoModel> buscar(Long id){
        return revisaoRepository.findById(id);
    }

    public void deletar(Long id){
        revisaoRepository.deleteById(id);
    }

    public RevisaoModel atualizar(Long id, RevisaoModel revisaoModel){
        RevisaoModel model = revisaoRepository.findById(id).orElseThrow(() -> new RuntimeException("Registro não encontrado"));

        model.setNome(revisaoModel.getNome());
        model.setPreco(revisaoModel.getPreco());

        return revisaoRepository.save(model);
    }
}
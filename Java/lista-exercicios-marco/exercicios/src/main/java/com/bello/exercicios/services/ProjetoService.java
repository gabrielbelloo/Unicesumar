package com.bello.exercicios.services;

import com.bello.exercicios.models.ProjetoModel;
import com.bello.exercicios.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    ProjetoRepository projetoRepository;

    public ProjetoModel adicionar(ProjetoModel projetoModel){
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> listar(){
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> buscar(Long id){
        return projetoRepository.findById(id);
    }

    public void deletar(Long id){
        projetoRepository.deleteById(id);
    }
}

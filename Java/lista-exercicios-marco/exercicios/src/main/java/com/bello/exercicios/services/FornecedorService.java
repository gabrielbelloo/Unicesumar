package com.bello.exercicios.services;

import com.bello.exercicios.models.FornecedorModel;
import com.bello.exercicios.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    @Autowired
    FornecedorRepository fornecedorRepository;

    public FornecedorModel adicionar(FornecedorModel fornecedorModel){
        return fornecedorRepository.save(fornecedorModel);
    }

    public List<FornecedorModel> listar(){
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> buscar(Long id){
        return fornecedorRepository.findById(id);
    }

    public void deletar(Long id){
        fornecedorRepository.deleteById(id);
    }
}

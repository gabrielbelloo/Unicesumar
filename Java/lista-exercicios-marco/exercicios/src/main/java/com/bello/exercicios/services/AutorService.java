package com.bello.exercicios.services;

import com.bello.exercicios.models.AutorModel;
import com.bello.exercicios.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    public AutorModel adicionar(AutorModel autorModel){
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> listar(){
        return autorRepository.findAll();
    }

    public Optional<AutorModel> buscar(Long id){
        return autorRepository.findById(id);
    }

    public void deletar(Long id){
        autorRepository.deleteById(id);
    }
}

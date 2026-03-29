package com.bello.exercicios.services;

import com.bello.exercicios.models.CategoriaModel;
import com.bello.exercicios.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository categoriaRepository;

    public CategoriaModel adicionar(CategoriaModel categoriaModel){
        return categoriaRepository.save(categoriaModel);
    }

    public List<CategoriaModel> listar(){
        return categoriaRepository.findAll();
    }

    public Optional<CategoriaModel> buscar(Long id){
        return categoriaRepository.findById(id);
    }

    public void deletar(Long id){
        categoriaRepository.deleteById(id);
    }
}

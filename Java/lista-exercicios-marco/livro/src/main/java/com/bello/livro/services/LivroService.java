package com.bello.livro.services;

import com.bello.livro.models.LivroModel;
import com.bello.livro.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    LivroRepository livroRepository;

    public LivroModel adicionar(LivroModel livroModel){
        return livroRepository.save(livroModel);
    }

    public List<LivroModel> listar(){
        return livroRepository.findAll();
    }

    public Optional<LivroModel> buscar(Long id){
        return livroRepository.findById(id);
    }

    public void deletar(Long id){
        livroRepository.deleteById(id);
    }
}

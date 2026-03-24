package com.bello.produto.services;

import com.bello.produto.models.ProdutoModel;
import com.bello.produto.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel adicionar(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> listar(){
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscar(Long id){
        return produtoRepository.findById(id);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }
}

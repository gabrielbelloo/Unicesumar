package com.bello.produtos.services;

import com.bello.produtos.models.ProdutoModel;
import com.bello.produtos.repositories.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel findById(Long id){
        return produtoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    public ProdutoModel save(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public ProdutoModel update(ProdutoModel produtoModel, Long id){
        ProdutoModel produto = findById(id);

        produto.setName(produtoModel.getName());

        return save(produto);
    }

    public void delete(Long id){
        if(!produtoRepository.existsById(id)) {
            throw new EntityNotFoundException();
        }
        produtoRepository.deleteById(id);
    }
}
package com.bello.produtos.services;

import com.bello.produtos.ProdutoModel;
import com.bello.produtos.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoModel create(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public void delete(Long id){
        produtoRepository.deleteById(id);
    }

    public ProdutoModel update(Long id, ProdutoModel produtoModel){
        ProdutoModel model = produtoRepository.findById(id).get();
        model.setNome(produtoModel.getNome());
        return produtoRepository.save(produtoModel);
    }
}

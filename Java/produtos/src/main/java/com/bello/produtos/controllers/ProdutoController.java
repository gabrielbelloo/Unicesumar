package com.bello.produtos.controllers;

import com.bello.produtos.models.ProdutoModel;
import com.bello.produtos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<ProdutoModel> findAll(){
        return produtoService.findAll();
    }

    @PostMapping
    public ProdutoModel create(@RequestBody ProdutoModel produtoModel){
        return produtoService.create(produtoModel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        produtoService.delete(id);
    }

    @PutMapping("/{id}")
    public ProdutoModel update(@PathVariable Long id, @RequestBody ProdutoModel produtoModel){
        return produtoService.update(id, produtoModel);
    }
}

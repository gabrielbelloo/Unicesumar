package com.bello.produto.controllers;

import com.bello.produto.models.ProdutoModel;
import com.bello.produto.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping
    public ProdutoModel adicionar(@RequestBody ProdutoModel produtoModel){
        return produtoService.adicionar(produtoModel);
    }

    @GetMapping
    public List<ProdutoModel> listar(){
        return produtoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> buscar(@PathVariable Long id){
        return produtoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        produtoService.deletar(id);
    }
}

package com.bello.fornecedor.controllers;

import com.bello.fornecedor.models.FornecedorModel;
import com.bello.fornecedor.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService;

    @PostMapping
    public FornecedorModel adicionar(@RequestBody FornecedorModel fornecedorModel){
        return fornecedorService.adicionar(fornecedorModel);
    }

    @GetMapping
    public List<FornecedorModel> listar(){
        return fornecedorService.listar();
    }

    @GetMapping("/{id}")
    public Optional<FornecedorModel> buscar(@PathVariable Long id){
        return fornecedorService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        fornecedorService.deletar(id);
    }
}

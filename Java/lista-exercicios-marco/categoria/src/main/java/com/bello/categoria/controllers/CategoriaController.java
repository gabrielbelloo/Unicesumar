package com.bello.categoria.controllers;

import com.bello.categoria.models.CategoriaModel;
import com.bello.categoria.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @PostMapping
    public CategoriaModel adicionar(@RequestBody CategoriaModel categoriaModel){
        return categoriaService.adicionar(categoriaModel);
    }

    @GetMapping
    public List<CategoriaModel> listar(){
        return categoriaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<CategoriaModel> buscsar(@PathVariable Long id){
        return categoriaService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        categoriaService.deletar(id);
    }
}

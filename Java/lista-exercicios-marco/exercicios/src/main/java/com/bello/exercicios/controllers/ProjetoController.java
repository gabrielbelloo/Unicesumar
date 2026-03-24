package com.bello.exercicios.controllers;

import com.bello.exercicios.models.ProjetoModel;
import com.bello.exercicios.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    @Autowired
    ProjetoService projetoService;

    @PostMapping
    public ProjetoModel adicionar(@RequestBody ProjetoModel projetoModel){
        return projetoService.adicionar(projetoModel);
    }

    @GetMapping
    public List<ProjetoModel> listar(){
        return projetoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<ProjetoModel> buscar(@PathVariable Long id){
        return projetoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        projetoService.deletar(id);
    }

}

package com.bello.departamento.controllers;

import com.bello.departamento.models.DepartamentoModel;
import com.bello.departamento.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @PostMapping
    public DepartamentoModel adicionar(@RequestBody DepartamentoModel departamentoModel){
        return departamentoService.adicionar(departamentoModel);
    }

    @GetMapping
    public List<DepartamentoModel> listar(){
        return departamentoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentoModel> buscar(@PathVariable Long id){
        return departamentoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        departamentoService.deletar(id);
    }
}
package com.bello.exercicios.controllers;

import com.bello.exercicios.models.AutorModel;
import com.bello.exercicios.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    AutorService autorService;

    @PostMapping
    public AutorModel adicionar(@RequestBody AutorModel autorModel){
        return autorService.adicionar(autorModel);
    }

    @GetMapping
    public List<AutorModel> listar(){
        return autorService.listar();
    }

    @GetMapping("/{id}")
    public Optional<AutorModel> buscar(@PathVariable Long id){
        return autorService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        autorService.deletar(id);
    }
}

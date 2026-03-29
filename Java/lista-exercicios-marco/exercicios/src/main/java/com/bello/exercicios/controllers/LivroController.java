package com.bello.exercicios.controllers;

import com.bello.exercicios.models.LivroModel;
import com.bello.exercicios.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livro")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @PostMapping
    public LivroModel adicionar(@RequestBody LivroModel livroModel){
        return livroService.adicionar(livroModel);
    }

    @GetMapping
    public List<LivroModel> listar(){
        return livroService.listar();
    }

    @GetMapping("/{id}")
    public Optional<LivroModel> buscar(@PathVariable Long id) {
        return livroService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        livroService.deletar(id);
    }
}

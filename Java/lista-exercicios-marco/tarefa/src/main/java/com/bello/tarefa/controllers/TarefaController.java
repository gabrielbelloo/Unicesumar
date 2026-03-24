package com.bello.tarefa.controllers;

import com.bello.tarefa.models.TarefaModel;
import com.bello.tarefa.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @PostMapping
    public TarefaModel adicionar(@RequestBody TarefaModel tarefaModel){
        return tarefaService.adicionar(tarefaModel);
    }

    @GetMapping
    public List<TarefaModel> listar(){
        return tarefaService.listar();
    }

    @GetMapping("/{id}")
    public Optional<TarefaModel> buscar(@PathVariable Long id){
        return tarefaService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        tarefaService.deletar(id);
    }
}

package com.bello.exercicios.controllers;

import com.bello.exercicios.models.ClienteModel;
import com.bello.exercicios.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public ClienteModel adicionar(@RequestBody ClienteModel clienteModel){
        return clienteService.adicionar(clienteModel);
    }

    @GetMapping
    public List<ClienteModel> listar(){
        return clienteService.listar();
    }

    @GetMapping("/{id}")
    public Optional<ClienteModel> buscar(@PathVariable Long id){
        return clienteService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteService.deletar(id);
    }
}

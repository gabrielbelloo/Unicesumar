package com.bello.exercicios.controllers;

import com.bello.exercicios.models.PedidoModel;
import com.bello.exercicios.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping
    public PedidoModel adicionar(@RequestBody PedidoModel pedidoModel){
        return pedidoService.adicionar(pedidoModel);
    }

    @GetMapping
    public List<PedidoModel> listar(){
        return pedidoService.listar();
    }

    @GetMapping("/{id}")
    public Optional<PedidoModel> buscar(@PathVariable Long id){
        return pedidoService.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        pedidoService.deletar(id);
    }
}

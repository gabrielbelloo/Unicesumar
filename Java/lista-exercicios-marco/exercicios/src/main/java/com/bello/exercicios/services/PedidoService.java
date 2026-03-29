package com.bello.exercicios.services;

import com.bello.exercicios.models.PedidoModel;
import com.bello.exercicios.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public PedidoModel adicionar(PedidoModel pedidoModel){
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> listar(){
        return pedidoRepository.findAll();
    }

    public Optional<PedidoModel> buscar(Long id){
        return pedidoRepository.findById(id);
    }

    public void deletar(Long id){
        pedidoRepository.deleteById(id);
    }
}

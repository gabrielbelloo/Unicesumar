package com.bello.pedido.services;

import com.bello.pedido.models.PedidoModel;
import com.bello.pedido.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public PedidoModel add(PedidoModel pedidoModel){
        return pedidoRepository.save(pedidoModel);
    }

    public List<PedidoModel> listar(){
        return pedidoRepository.findAll();
    }

    public PedidoModel buscar(Long id){
        return pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public void deletar(Long id){
        if (!pedidoRepository.existsById(id)){
            throw new RuntimeException("Pedido não encontrado");
        }
        pedidoRepository.deleteById(id);
    }

    public PedidoModel atualizar(Long id, PedidoModel pedidoModel){
        PedidoModel model = pedidoRepository.findById(id).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));

        model.setNome(pedidoModel.getNome());
        model.setPreco(pedidoModel.getPreco());

        return pedidoRepository.save(model);
    }
}
package com.bello.cliente.services;

import com.bello.cliente.models.ClienteModel;
import com.bello.cliente.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServices {

    @Autowired
    ClienteRepository clienteRepository;

    public ClienteModel adicionar(ClienteModel clienteModel){
        return clienteRepository.save(clienteModel);
    }

    public List<ClienteModel> listar(){
        return clienteRepository.findAll();
    }

    public Optional<ClienteModel> buscar(Long id){
        return clienteRepository.findById(id);
    }

    public void deletar(Long id){
        clienteRepository.deleteById(id);
    }
}

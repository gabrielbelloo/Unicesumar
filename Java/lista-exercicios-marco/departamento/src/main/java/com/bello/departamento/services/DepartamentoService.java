package com.bello.departamento.services;

import com.bello.departamento.models.DepartamentoModel;
import com.bello.departamento.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public DepartamentoModel adicionar(DepartamentoModel departamentoModel){
        return departamentoRepository.save(departamentoModel);
    }

    public List<DepartamentoModel> listar(){
        return departamentoRepository.findAll();
    }

    public Optional<DepartamentoModel> buscar(Long id){
        return departamentoRepository.findById(id);
    }

    public void deletar(Long id){
        departamentoRepository.deleteById(id);
    }
}

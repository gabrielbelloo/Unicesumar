package com.bello.tarefa.services;

import com.bello.tarefa.models.TarefaModel;
import com.bello.tarefa.repositories.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;

    public TarefaModel adicionar(TarefaModel tarefaModel){
        return tarefaRepository.save(tarefaModel);
    }

    public List<TarefaModel> listar(){
        return tarefaRepository.findAll();
    }

    public Optional<TarefaModel> buscar(Long id){
        return tarefaRepository.findById(id);
    }

    public void delete(Long id){
        tarefaRepository.deleteById(id);
    }
}

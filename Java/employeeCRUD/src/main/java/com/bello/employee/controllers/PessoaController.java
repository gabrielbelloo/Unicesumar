package com.bello.employee.controllers;

import com.bello.employee.models.PessoaModel;
import com.bello.employee.services.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoas")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<PessoaModel> findAll(){
        return pessoaService.findAll();
    }

    @PostMapping
    public PessoaModel criar(@RequestBody PessoaModel pessoaModel){
        return pessoaService.criar(pessoaModel);
    }
}
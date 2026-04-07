package com.bello.aluno.controllers;

import com.bello.aluno.models.AlunoModel;
import com.bello.aluno.services.AlunoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/api/aluno")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    public ResponseEntity<AlunoModel> add(@RequestBody AlunoModel alunoModel){
        try {
            AlunoModel request = alunoService.add(alunoModel);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(request.getId()).toUri();
            return ResponseEntity.created(uri).body(request);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().build();
        }

    }

    @GetMapping
    public ResponseEntity<List<AlunoModel>> listar(){
        List<AlunoModel> request = alunoService.listar();
        return ResponseEntity.ok(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> buscar(@PathVariable Long id){
        try {
            AlunoModel request = alunoService.buscar(id);
            return ResponseEntity.ok(request);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        try {
            alunoService.deletar(id);
            return ResponseEntity.noContent().build();
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoModel> atualizar(@PathVariable Long id, @RequestBody AlunoModel alunoModel){
        try {
            AlunoModel request = alunoService.atualizar(id, alunoModel);
            return ResponseEntity.ok(request);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }
}
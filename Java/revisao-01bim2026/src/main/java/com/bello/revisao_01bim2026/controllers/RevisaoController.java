package com.bello.revisao_01bim2026.controllers;

import com.bello.revisao_01bim2026.models.RevisaoModel;
import com.bello.revisao_01bim2026.services.RevisaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.swing.text.html.Option;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/revisao")
public class RevisaoController {

    @Autowired
    RevisaoService revisaoService;

    @PostMapping
    public ResponseEntity<RevisaoModel> add(@RequestBody RevisaoModel revisaoModel){
        RevisaoModel request = revisaoService.add(revisaoModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(request.getId()).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping
    public ResponseEntity<List<RevisaoModel>> listar(){
        List<RevisaoModel> request = revisaoService.listar();
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<RevisaoModel>> buscar(@PathVariable Long id){
        Optional<RevisaoModel> request = revisaoService.buscar(id);
        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        revisaoService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<RevisaoModel> atualizar(@PathVariable Long id, @RequestBody RevisaoModel revisaoModel){
        RevisaoModel request = revisaoService.atualizar(id, revisaoModel);
        return ResponseEntity.ok().body(request);
    }

}

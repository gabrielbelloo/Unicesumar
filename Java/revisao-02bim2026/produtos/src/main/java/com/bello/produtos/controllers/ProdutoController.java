package com.bello.produtos.controllers;

import com.bello.produtos.models.ProdutoModel;
import com.bello.produtos.services.ProdutoService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping()
    public ResponseEntity<List<ProdutoModel>> findAll() {
        List<ProdutoModel> response = produtoService.findAll();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModel> findById(@PathVariable Long id){
        try {
            ProdutoModel response = produtoService.findById(id);
            return ResponseEntity.ok(response);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping()
    public ResponseEntity<ProdutoModel> save(@RequestBody ProdutoModel produtoModel){
        try {
            ProdutoModel response = produtoService.save(produtoModel);
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(response.getId()).toUri();
            return ResponseEntity.created(uri).body(response);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoModel> update(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        try {
            ProdutoModel response = produtoService.update(produtoModel, id);
            return ResponseEntity.ok(response);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        try {
            produtoService.delete(id);
            return ResponseEntity.ok().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
}

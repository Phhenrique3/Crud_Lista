package com.example.crud_lista.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud_lista.model.Produto;
import com.example.crud_lista.service.ProdutoService;




@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    
    private final ProdutoService service;

    public ProdutoController(ProdutoService service){
        this.service = service;
    }

     @GetMapping
    public List<Produto> listar() {
        return service.listarTodos();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscar(@PathVariable Long id) {
        Produto produto = service.BuscarPorId(id);
        return (produto != null) ? ResponseEntity.ok(produto) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto){
        return service.Salva(null, produto);
    }

     @PutMapping("/{id}")
    public ResponseEntity<Produto> atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        Produto atualizado = service.atualizar(id, produto);
        return (atualizado != null) ? ResponseEntity.ok(atualizado) : ResponseEntity.notFound().build();
    } 

     @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        return service.deletar(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }

}


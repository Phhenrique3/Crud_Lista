package com.example.crud_lista.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.crud_lista.model.Produto;

@Service
public class ProdutoService {

    private Map<Long, Produto> produtos = new HashMap<>();
    private Long contador = 1l;

    public List<Produto> listarTodos() {
        return  new ArrayList<>(produtos.values());
    }

    public Produto BuscarPorId(Long id){
        return produtos.get(id);
    }

    public Produto Salva(Long id, Produto produto){
        produto.setId(contador++);
        produtos.put(produto.getId(),produto);
        return produto;
    }
    public Produto atualizar(Long id, Produto produto) {
        if (produtos.containsKey(id)) {
            produto.setId(id);
            produtos.put(id, produto);
            return produto;
        }
        return null;
    }
    public boolean deletar(Long id) {
        return produtos.remove(id) != null;
    }

}

package com.best2log.best2log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best2log.best2log.entity.Estoque;
import com.best2log.best2log.repository.EstoqueRepository;

@Service
public class EstoqueService {
    
    @Autowired
    EstoqueRepository estoqueRepository;

    public List<Estoque> getAllEstoque(){
        return estoqueRepository.findAll(); 
    }
    
    public Estoque getEstoqueById(int id) {
        return estoqueRepository.findById(id).orElse(null);
    }

    public Estoque saveEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }
    
    public Estoque updateEstoque(Estoque estoque, Integer id) {
        Estoque estoqueExistente = getEstoqueById(id);
        estoque.setAllAtributos(estoque);
        return estoqueRepository.save(estoqueExistente);
    }
    
    public Estoque deleteEstoque(Integer id) {
        estoqueRepository.deleteById(id);
        return getEstoqueById(id);
    }
}
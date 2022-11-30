package com.best2log.best2log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best2log.best2log.entity.OrdemDeEntrega;
import com.best2log.best2log.repository.OrdemDeEntregaRepository;

@Service
public class OrdemDeEntregaService {
    
    @Autowired
    OrdemDeEntregaRepository ordemDeEntregaRepository;

    public List<OrdemDeEntrega> getAllOrdemDeEntregas(){
        return ordemDeEntregaRepository.findAll(); 
    }
    
    public OrdemDeEntrega getOrdemDeEntregaById(int id) {
        return ordemDeEntregaRepository.findById(id).orElse(null);
    }

    public OrdemDeEntrega saveOrdemDeEntrega(OrdemDeEntrega ordemDeEntrega) {
        return ordemDeEntregaRepository.save(ordemDeEntrega);
    }
    
    public OrdemDeEntrega updateOrdemDeEntrega(OrdemDeEntrega ordemDeEntrega, Integer id) {
        OrdemDeEntrega ordemDeEntregaExistente = getOrdemDeEntregaById(id);
        ordemDeEntrega.setAllAtributos(ordemDeEntrega);
        return ordemDeEntregaRepository.save(ordemDeEntregaExistente);
    }

    public OrdemDeEntrega deleteOrdemDeEntrega(Integer id) {
        ordemDeEntregaRepository.deleteById(id);
        return getOrdemDeEntregaById(id);
    }
}
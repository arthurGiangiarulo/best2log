package com.best2log.best2log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best2log.best2log.entity.CentroDistribuicao;
import com.best2log.best2log.repository.CentroDistribuicaoRepository;

@Service
public class CentroDistribuicaoService {
    
    @Autowired
    CentroDistribuicaoRepository centroDistribuicaoRepository;

    public List<CentroDistribuicao> getAllCentroDistribuicao(){
        return centroDistribuicaoRepository.findAll();
    }

    public CentroDistribuicao getCentroDistribuicaoById(Integer id){
        return centroDistribuicaoRepository.findById(id).orElse(null);
    }

    public CentroDistribuicao saveCentroDistribuicao(CentroDistribuicao centroDistribuicao) {
        return centroDistribuicaoRepository.save(centroDistribuicao);
    }

    public CentroDistribuicao updateCentroDistribuicao(CentroDistribuicao centroDistribuicao, Integer id) {
        CentroDistribuicao centroDistribuicaoExistente = getCentroDistribuicaoById(id);
        centroDistribuicaoExistente.setAllAtributos(centroDistribuicao);
        return centroDistribuicaoRepository.save(centroDistribuicaoExistente);
    }

    public CentroDistribuicao deleteCentroDistribuicao(Integer id) {
        centroDistribuicaoRepository.deleteById(id);
        return getCentroDistribuicaoById(id);
    }

}

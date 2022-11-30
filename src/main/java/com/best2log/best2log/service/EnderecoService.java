package com.best2log.best2log.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.best2log.best2log.entity.CentroDistribuicao;
import com.best2log.best2log.entity.Endereco;
import com.best2log.best2log.repository.CentroDistribuicaoRepository;
import com.best2log.best2log.repository.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    EnderecoRepository enderecoRepository;

	public List<Endereco> getAllEnderecos(){
		return enderecoRepository.findAll(); 
	}
	
	public Endereco getEnderecoById(int id) {
		return enderecoRepository.findById(id).orElse(null);
	}

    public Endereco saveEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    public Endereco updateEndereco(Endereco endereco, Integer id) {
            Endereco endereteExistente = getEnderecoById(id);
            endereco.setAllAtributos(endereco);
			return enderecoRepository.save(enderecoExistente);
        }

;
}

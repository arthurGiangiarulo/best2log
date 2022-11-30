package com.best2log.best2log.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "centro_distribuicao")
public class CentroDistribuicao {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_centro_distribuicao")
    private Integer idCentroDistribuicao;

    @Column(name = "nome_centro_distribuicao")
    private String nomeCentroDistribuicao;

    @Column(name = "endereco")
    private Endereco endereco;

    @Column(name = "responsavel")
    private Administrador responsavel;

    @Column(name = "listaConferente")
    private ArrayList<Conferente> listaConferente;

    @Column(name = "bairrosAssociados")
    private ArrayList<String> bairrosAssociados;

    @Column(name = "estoquista")
    private ArrayList<Estoquista> listaEstoquista;

    @Column(name = "ativo")
    private boolean ativo;

    public Integer getIdCentroDistribuicao() {
        return idCentroDistribuicao;
    }

    public void setIdCentroDistribuicao(Integer idCentroDistribuicao) {
        this.idCentroDistribuicao = idCentroDistribuicao;
    }

    public String getNomeCentroDistribuicao() {
        return nomeCentroDistribuicao;
    }

    public void setNomeCentroDistribuicao(String nomeCentroDistribuicao) {
        this.nomeCentroDistribuicao = nomeCentroDistribuicao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Administrador getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Administrador responsavel) {
        this.responsavel = responsavel;
    }

    public ArrayList<Conferente> getListaConferente() {
        return listaConferente;
    }

    public void setListaConferente(ArrayList<Conferente> listaConferente) {
        this.listaConferente = listaConferente;
    }

    public ArrayList<String> getBairrosAssociados() {
        return bairrosAssociados;
    }

    public void setBairrosAssociados(ArrayList<String> bairrosAssociados) {
        this.bairrosAssociados = bairrosAssociados;
    }

    public ArrayList<Estoquista> getListaEstoquista() {
        return listaEstoquista;
    }

    public void setListaEstoquista(ArrayList<Estoquista> listaEstoquista) {
        this.listaEstoquista = listaEstoquista;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setAllAtributos(CentroDistribuicao centroDistribuicao) {
        this.setIdCentroDistribuicao(centroDistribuicao.getIdCentroDistribuicao());
        this.setNomeCentroDistribuicao(centroDistribuicao.getNomeCentroDistribuicao());
        this.setEndereco(centroDistribuicao.getEndereco());
        this.setResponsavel(centroDistribuicao.getResponsavel());
        this.setListaConferente(centroDistribuicao.getListaConferente());
        this.setBairrosAssociados(centroDistribuicao.bairrosAssociados);
        this.setListaEstoquista(centroDistribuicao.getListaEstoquista());
        this.setAtivo(centroDistribuicao.getAtivo());
    }

}

//OK
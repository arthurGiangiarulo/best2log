package com.best2log.best2log.entity;

import java.util.ArrayList;

import javax.persistence.Column;

public class CentroDistribuicao {

    @Column(name = "id_centroDistribuicao")
    private Integer id_CentroDistribuicao;

    @Column(name = "nome_CentroDistribuicao")
    private String nome_CentroDistribuicao;

    @Column(name = "endereco")
    private Endereco endereco;

    @Column(name = "responsavel")
    private Administrador resoponsavel;

    @Column(name = "listaConferente")
    private Conferente listaConferente;

    @Column(name = "bairrosAssociados")
    private ArrayList<String> bairrosAssociados;

    @Column(name = "estoquista")
    private Estoquista estoquista;

    @Column(name = "status")
    private String status;

    public CentroDistribuicao(Integer id_CentroDistribuicao, String nome_CentroDistribuicao, Endereco endereco,
            Administrador resoponsavel, Conferente listaConferente, ArrayList<String> bairrosAssociados,
            Estoquista estoquista, String status) {
        this.id_CentroDistribuicao = id_CentroDistribuicao;
        this.nome_CentroDistribuicao = nome_CentroDistribuicao;
        this.endereco = endereco;
        this.resoponsavel = resoponsavel;
        this.listaConferente = listaConferente;
        this.bairrosAssociados = bairrosAssociados;
        this.estoquista = estoquista;
        this.status = status;
    }

    public CentroDistribuicao() {
    }

    public Integer getId_CentroDistribuicao() {
        return id_CentroDistribuicao;
    }

    public void setId_CentroDistribuicao(Integer id_CentroDistribuicao) {
        this.id_CentroDistribuicao = id_CentroDistribuicao;
    }

    public String getNome_CentroDistribuicao() {
        return nome_CentroDistribuicao;
    }

    public void setNome_CentroDistribuicao(String nome_CentroDistribuicao) {
        this.nome_CentroDistribuicao = nome_CentroDistribuicao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Administrador getResoponsavel() {
        return resoponsavel;
    }

    public void setResoponsavel(Administrador resoponsavel) {
        this.resoponsavel = resoponsavel;
    }

    public Conferente getListaConferente() {
        return listaConferente;
    }

    public void setListaConferente(Conferente listaConferente) {
        this.listaConferente = listaConferente;
    }

    public ArrayList<String> getBairrosAssociados() {
        return bairrosAssociados;
    }

    public void setBairrosAssociados(ArrayList<String> bairrosAssociados) {
        this.bairrosAssociados = bairrosAssociados;
    }

    public Estoquista getEstoquista() {
        return estoquista;
    }

    public void setEstoquista(Estoquista estoquista) {
        this.estoquista = estoquista;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
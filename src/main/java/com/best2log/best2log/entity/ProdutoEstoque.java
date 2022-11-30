package com.best2log.best2log.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ProdutoEstoque")

public class ProdutoEstoque {

    @Column(name = "id_produtoEstoque")
    private Integer id_produtoEstoque;

    @Column(name = "ordemDeEntrega")
    private OrdemDeEntrega ordemDeEntrega;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "estoque")
    private Estoque estoque;

    @Column(name = "localizacao")
    private String localizacao;

    @Column(name = "conferente")
    private Conferente conferente;

    @Column(name = "estoquista")
    private Estoquista estoquista;

    public ProdutoEstoque() {
    }

    public Integer getId_produtoEstoque() {
        return id_produtoEstoque;
    }

    public void setId_produtoEstoque(Integer id_produtoEstoque) {
        this.id_produtoEstoque = id_produtoEstoque;
    }

    public OrdemDeEntrega getOrdemDeEntrega() {
        return ordemDeEntrega;
    }

    public void setOrdemDeEntrega(OrdemDeEntrega ordemDeEntrega) {
        this.ordemDeEntrega = ordemDeEntrega;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Conferente getConferente() {
        return conferente;
    }

    public void setConferente(Conferente conferente) {
        this.conferente = conferente;
    }

    public Estoquista getEstoquista() {
        return estoquista;
    }

    public void setEstoquista(Estoquista estoquista) {
        this.estoquista = estoquista;
    }

}
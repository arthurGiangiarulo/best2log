package com.best2log.best2log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Estoque")

public class Estoque {

    @Column(name = "id_Estoque")
    private Integer id_Estoque;

    @Column(name = "listaEstoque")
    private ProdutoEstoque listaEstoque;

    @Column(name = "centroDistribuicao")
    private CentroDistribuicao centroDistribuicao;

    @Column(name = "tipo")
    private String tipo;

    public Integer getId_Estoque() {
        return id_Estoque;
    }

    public void setId_Estoque(Integer id_Estoque) {
        this.id_Estoque = id_Estoque;
    }

    public ProdutoEstoque getListaEstoque() {
        return listaEstoque;
    }

    public void setListaEstoque(ProdutoEstoque listaEstoque) {
        this.listaEstoque = listaEstoque;
    }

    public CentroDistribuicao getCentroDistribuicao() {
        return centroDistribuicao;
    }

    public void setCentroDistribuicao(CentroDistribuicao centroDistribuicao) {
        this.centroDistribuicao = centroDistribuicao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

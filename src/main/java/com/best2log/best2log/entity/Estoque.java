package com.best2log.best2log.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "estoque")
public class Estoque {

    @Column(name = "id_estoque")
    private Integer idEstoque;

    @Column(name = "lista_estoque")
    private ArrayList<EntregaProduto> listaEstoque;

    @Column(name = "centro_distribuicao")
    private CentroDistribuicao centroDistribuicao;

    @Column(name = "tipo")
    private TipoEstoque tipo;

    public Integer getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(Integer idEstoque) {
        this.idEstoque = idEstoque;
    }

    public ArrayList<EntregaProduto> getListaEstoque() {
        return listaEstoque;
    }

    public void setListaEstoque(ArrayList<EntregaProduto> listaEstoque) {
        this.listaEstoque = listaEstoque;
    }

    public CentroDistribuicao getCentroDistribuicao() {
        return centroDistribuicao;
    }

    public void setCentroDistribuicao(CentroDistribuicao centroDistribuicao) {
        this.centroDistribuicao = centroDistribuicao;
    }

    public TipoEstoque getTipo() {
        return tipo;
    }

    public void setTipo(TipoEstoque tipo) {
        this.tipo = tipo;
    }

        public void setAllAtributos(Estoque estoque) {
        this.setIdEstoque(estoque.getIdEstoque());
        this.setListaEstoque(estoque.getListaEstoque());
        this.setCentroDistribuicao(estoque.getCentroDistribuicao());
        this.setTipo(estoque.getTipo());
    }
}

//OK 

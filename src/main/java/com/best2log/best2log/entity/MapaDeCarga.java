package com.best2log.best2log.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ProdutoEstoque")
public class MapaDeCarga {

    @Column(name = "id_MapaDeCarga")
    private Integer id_MapaDeCarga;

    @Column(name = "listaProdutoEstoque")
    private ProdutoEstoque listaProdutoEstoque;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "estoquista")
    private Estoquista estoquista;

    @Column(name = "status")
    private String status;

    @Column(name = "motorista")
    private Motorista motorista;

    public MapaDeCarga() {
    }

    public Integer getId_MapaDeCarga() {
        return id_MapaDeCarga;
    }

    public void setId_MapaDeCarga(Integer id_MapaDeCarga) {
        this.id_MapaDeCarga = id_MapaDeCarga;
    }

    public ProdutoEstoque getListaProdutoEstoque() {
        return listaProdutoEstoque;
    }

    public void setListaProdutoEstoque(ProdutoEstoque listaProdutoEstoque) {
        this.listaProdutoEstoque = listaProdutoEstoque;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
}
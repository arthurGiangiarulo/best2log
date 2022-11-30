package com.best2log.best2log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "OrdemDeEntrega")
public class OrdemDeEntrega {

    @Column(name = "id_OrdemDeEntrega")
    private Integer id_OrdemDeEntrega;

    @Column(name = "listaProdutos")
    private String listaProdutos;

    @Column(name = "empresaParceira")
    private EmpresaParceira empresaParceira;

    public OrdemDeEntrega() {
    }

    public Integer getId_OrdemDeEntrega() {
        return id_OrdemDeEntrega;
    }

    public void setId_OrdemDeEntrega(Integer id_OrdemDeEntrega) {
        this.id_OrdemDeEntrega = id_OrdemDeEntrega;
    }

    public String getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(String listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public EmpresaParceira getEmpresaParceira() {
        return empresaParceira;
    }

    public void setEmpresaParceira(EmpresaParceira empresaParceira) {
        this.empresaParceira = empresaParceira;
    }

}

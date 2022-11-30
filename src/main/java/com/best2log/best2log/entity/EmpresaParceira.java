package com.best2log.best2log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmpresaParceira")
public class EmpresaParceira {

    @Column(name = "id_EmpresaParceira")
    private Integer id_EmpresaParceira;

    @Column(name = "nome_EmpresaParceira")
    private String nome_EmpresaParceira;

    @Column(name = "razaoSocial")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "status")
    private String status;

    public EmpresaParceira() {

    }

    public Integer getId_EmpresaParceira() {
        return id_EmpresaParceira;
    }

    public void setId_EmpresaParceira(Integer id_EmpresaParceira) {
        this.id_EmpresaParceira = id_EmpresaParceira;
    }

    public String getNome_EmpresaParceira() {
        return nome_EmpresaParceira;
    }

    public void setNome_EmpresaParceira(String nome_EmpresaParceira) {
        this.nome_EmpresaParceira = nome_EmpresaParceira;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

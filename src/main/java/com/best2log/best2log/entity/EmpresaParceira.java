package com.best2log.best2log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa_parceira")
public class EmpresaParceira {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa_parceira")
    private Integer idEmpresaParceira;

    @Column(name = "nome_empresa_parceira")
    private String nomeEmpresaParceira;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "ativo")
    private boolean ativo;

    @Column(name = "endereco")
    private Endereco endereco;

    public EmpresaParceira(){

    }

    public Integer getIdEmpresaParceira() {
        return idEmpresaParceira;
    }

    public void setIdEmpresaParceira(Integer idEmpresaParceira) {
        this.idEmpresaParceira = idEmpresaParceira;
    }

    public String getNomeEmpresaParceira() {
        return nomeEmpresaParceira;
    }

    public void setNomeEmpresaParceira(String nomeEmpresaParceira) {
        this.nomeEmpresaParceira = nomeEmpresaParceira;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
	private boolean getAtivo() {
		return false;
	}

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
       public void setAllAtributos(EmpresaParceira empresaParceira) {
        this.setIdEmpresaParceira(empresaParceira.getIdEmpresaParceira());
        this.setNomeEmpresaParceira(empresaParceira.getNomeEmpresaParceira());
        this.setRazaoSocial(empresaParceira.getRazaoSocial());
        this.setCnpj(empresaParceira.getCnpj());
        this.setAtivo(empresaParceira.getAtivo());
        this.setEndereco(empresaParceira.getEndereco());
    }
}

//OK
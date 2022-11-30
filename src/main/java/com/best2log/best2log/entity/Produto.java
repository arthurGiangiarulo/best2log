package com.best2log.best2log.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produto")
    private Integer id_produto;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nome_produto")
    private String nomeProduto;
    
    @Column(name = "categoria")
    private String categoria;
    
    @Column(name = "data")
    private Instant data;
    
    @Column(name = "status")
    private StatusProduto status;

    @Column(name = "remetente")
    private EmpresaParceira empresaParceira;

    @Column(name = "endereco")
    private Endereco endereco;

    @Column(name = "conferente")
    private Conferente conferente;

    @Column(name = "estoquista")
    private Estoquista estoquista;

    @Column(name = "estoque")
    private Estoque estoque;

    @Column(name = "localizacao")
    private String localizacao;

    @Column(name = "ativo")
    private boolean ativo;

    public Integer getId_produto() {
        return id_produto;
    }

    public void setId_produto(Integer id_produto) {
        this.id_produto = id_produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }

    public StatusProduto getStatus() {
        return status;
    }

    public void setStatus(StatusProduto status) {
        this.status = status;
    }

    public EmpresaParceira getEmpresaParceira() {
        return empresaParceira;
    }

    public void setEmpresaParceira(EmpresaParceira empresaParceira) {
        this.empresaParceira = empresaParceira;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


}

//OK

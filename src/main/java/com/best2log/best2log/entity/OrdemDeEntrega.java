package com.best2log.best2log.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordem_de_entrega")
public class OrdemDeEntrega {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ordem_de_entrega")
    private Integer idOrdemDeEntrega;

    @Column(name = "lista_produtos")
    private ArrayList<EntregaProduto> listaProdutos;

    @Column(name = "empresa_parceira")
    private EmpresaParceira empresaParceira;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "administrador")
    private Administrador administrador;

    public OrdemDeEntrega(){
        
    }

    public Integer getIdOrdemDeEntrega() {
        return idOrdemDeEntrega;
    }

    public void setIdOrdemDeEntrega(Integer idOrdemDeEntrega) {
        this.idOrdemDeEntrega = idOrdemDeEntrega;
    }

    public ArrayList<EntregaProduto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<EntregaProduto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public EmpresaParceira getEmpresaParceira() {
        return empresaParceira;
    }

    public void setEmpresaParceira(EmpresaParceira empresaParceira) {
        this.empresaParceira = empresaParceira;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

        public void setAllAtributos(OrdemDeEntrega ordemDeEntrega) {
        this.setIdOrdemDeEntrega(ordemDeEntrega.getIdOrdemDeEntrega());
        this.setListaProdutos(ordemDeEntrega.getListaProdutos());
        this.setEmpresaParceira(ordemDeEntrega.getEmpresaParceira());
        this.setData(ordemDeEntrega.getData());
        this.setAdministrador(ordemDeEntrega.getAdministrador());
}

}

//OK

package com.best2log.best2log.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "entrega_produto")
public class EntregaProduto {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrega_produto")
    private Integer idEntregaProduto;
    
    @Column(name = "produto")
    private Produto produto;
    
    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "ordem_de_entrega")
    private OrdemDeEntrega ordemDeEntrega;

	public EntregaProduto(){
    }

    public Integer getIdEntregaProduto() {
        return idEntregaProduto;
    }

    public void setIdEntregaProduto(Integer idEntregaProduto) {
        this.idEntregaProduto = idEntregaProduto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public OrdemDeEntrega getOrdemDeEntrega() {
        return ordemDeEntrega;
    }
    private void setOrdemDeEntrega(OrdemDeEntrega ordemDeEntrega) {
    }
 
    public void setAllAtributos(EntregaProduto entregaProduto) {
        this.setIdEntregaProduto(entregaProduto.getIdEntregaProduto());
        this.setQuantidade(entregaProduto.getQuantidade());
        this.setOrdemDeEntrega(entregaProduto.getOrdemDeEntrega());
        this.setProduto(entregaProduto.getProduto());
}

}
      

//OK
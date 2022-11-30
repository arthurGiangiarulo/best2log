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
@Table(name = "produto_estoque")
public class MapaDeCarga {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mapa_de_carga")
    private Integer idMapaDeCarga;

    @Column(name = "lista_carga")
    private ArrayList<EntregaProduto> listaCarga;

    @Column(name = "data")
    private LocalDateTime data;

    @Column(name = "estoquista")
    private Estoquista estoquista;

    @Column(name = "status")
    private StatusProduto status;
    //Só pode: AGUARDANDO_CONFERENCIA, SEPARADO, EM_TRANSITO, ENTREGUE;

    @Column(name = "motorista")
    private Motorista motorista;

    public Integer getIdMapaDeCarga() {
        return idMapaDeCarga;
    }

    public void setIdMapaDeCarga(Integer idMapaDeCarga) {
        this.idMapaDeCarga = idMapaDeCarga;
    }

    public ArrayList<EntregaProduto> getListaCarga() {
        return listaCarga;
    }

    public void setListaCarga(ArrayList<EntregaProduto> listaCarga) {
        this.listaCarga = listaCarga;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Estoquista getEstoquista() {
        return estoquista;
    }

    public void setEstoquista(Estoquista estoquista) {
        this.estoquista = estoquista;
    }

    public StatusProduto getStatus() {
        return status;
    }

    public void setStatus(StatusProduto status) {
        this.status = status;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

}

//OK
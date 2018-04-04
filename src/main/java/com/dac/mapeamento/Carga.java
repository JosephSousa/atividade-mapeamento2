package com.dac.mapeamento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 * @brief Classe Carga
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   04/04/2018
 */
@Entity
public class Carga implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;

    private String origem;

    private String destino;

    @OneToOne
    private Transporte transporte;

    @ManyToMany(mappedBy = "cargas")
    private List<Produto> produtos;

    public Carga() {
    }

    public Carga(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.produtos=new ArrayList<>();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    
}

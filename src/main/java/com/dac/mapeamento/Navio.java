package com.dac.mapeamento;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @brief Classe Navio
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date 04/04/2018
 */
@Entity
public class Navio implements Serializable {

    @Id
    private int codigo;
    private String nome;
    private int capacidade;
    private String pais;
    @ManyToOne
    private Comandante comandante;

    public Navio() {
    }

    public Navio(String nome, int capacidade, String pais) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }
    
}

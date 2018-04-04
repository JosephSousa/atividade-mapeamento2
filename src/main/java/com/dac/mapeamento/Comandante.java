package com.dac.mapeamento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * @brief Classe Comandante
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date 04/04/2018
 */
@Entity
public class Comandante implements Serializable {

    @Id
    @GeneratedValue
    private int id;
    private String nome;

    private String pais;

    @OneToMany(mappedBy = "comandante")
    private List<Navio> navios;

    public Comandante() {
    }

    public Comandante(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.navios=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void addNavio(Navio navio) {
        this.navios.add(navio);
    }

}

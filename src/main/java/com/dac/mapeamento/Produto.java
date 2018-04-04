package com.dac.mapeamento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @brief Classe Produto
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   04/04/2018
 */
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue
    private int codigo;
    private String categoria;
    private String nome;
    @ManyToMany
    private List<Carga> cargas;

    public Produto() {
    }

    public Produto(String categoria, String nome) {
        this.categoria = categoria;
        this.nome = nome;
        this.cargas=new ArrayList<>();
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public void addCargas(Carga carga) {
        this.cargas.add(carga);
    }
    
    

}

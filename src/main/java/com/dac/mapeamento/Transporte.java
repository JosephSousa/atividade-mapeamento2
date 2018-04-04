package com.dac.mapeamento;


import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @brief Classe Transporte
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   04/04/2018
 */
@Entity
public class Transporte implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Convert(converter = LocalDateConvert.class)
    private LocalDate dataTransporte;

    @Column(nullable = false)
    private double valor;

    @OneToOne
    private Carga carga;

    @ManyToOne
    private Navio navio;

    public Transporte() {
    }

    public Transporte(LocalDate data, double valor) {
        this.dataTransporte = data;
        this.valor = valor;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return dataTransporte;
    }

    public void setData(LocalDate data) {
        this.dataTransporte = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }
    
    
    
    
}

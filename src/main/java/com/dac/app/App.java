package com.dac.app;

import com.dac.mapeamento.Carga;
import com.dac.mapeamento.Comandante;
import com.dac.mapeamento.Navio;
import com.dac.mapeamento.Produto;
import com.dac.mapeamento.Transporte;
import java.time.LocalDate;
import java.time.Month;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @brief Classe App
 * @author Joseph Sousa
 * @mail jsantos.te@gmail.com
 * @date   04/04/2018
 */
public class App {
    
    public static void main(String[] args) {
            
     EntityManager em = Persistence
                    .createEntityManagerFactory("mapeamento-PU")
                    .createEntityManager();
     
      Carga carga = new Carga("Cajazeiras", "João Pessoa");
      carga.setCodigo(1);
      Produto produto = new Produto("Alimento", "Coca Cola");
      produto.setCodigo(1);
      Comandante comandante = new Comandante("Jack Sparrow", "Estados Unidos");
      comandante.setId(1);
      Transporte transporte = new Transporte(LocalDate.of(2018, Month.OCTOBER, 23), 2500);
      transporte.setId(1);
      Navio navio = new Navio("Pérola Negra", 3000, "Escócia");
      navio.setCodigo(1);
      navio.setComandante(comandante);
      produto.addCargas(carga);
      transporte.setNavio(navio);
      transporte.setCarga(carga);
      carga.setTransporte(transporte);
      carga.addProduto(produto);
      
      EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(carga);
        em.persist(produto);
        em.persist(comandante);
        em.persist(navio);
        em.persist(transporte);
        transaction.commit();
    }

}

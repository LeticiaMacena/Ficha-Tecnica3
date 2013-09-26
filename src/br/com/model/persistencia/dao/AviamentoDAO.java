/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Aviamento;
import java.util.List;

/**
 *
 * @author User
 */
public interface AviamentoDAO extends DAO<Aviamento, Integer>{
    
          //Asinatura dos metodos
    List<Aviamento> getByNome (String nome);
   // Aviamento getAviamentoByNome(String nome);
    Aviamento getAviamentoByNome(String nome);
}

    


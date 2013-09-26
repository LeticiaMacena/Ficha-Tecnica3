/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Tecido;
import java.util.List;

/**
 *
 * @author leticia_macena
 */
public interface TecidoDAO extends DAO<Tecido, Integer>{
      
    //Asinatura dos metodos
    List<Tecido> getByNome (String nome);
   // Tecido getTecidoByNome(String nome);
 
    public List<Tecido> getByNomeDescricao(String nome, String descricao);
}

    


    

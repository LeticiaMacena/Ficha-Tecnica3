/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Fornecedor;
import java.util.List;

/**
 *
 * @author leticia_macena
 */
public interface FornecedorDAO extends DAO<Fornecedor, Integer> {
    
  
     List<Fornecedor> getByNome (String nome);
    Fornecedor getFornecedorByNome(String nome);


    
}

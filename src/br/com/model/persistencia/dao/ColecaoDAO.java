/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia.dao;

import br.com.model.negocio.Colecao;
import br.com.model.negocio.Funcao;
import java.util.List;

/**
 *
 * @author User
 */
public interface ColecaoDAO extends DAO<Colecao, Integer> {
        //Asinatura dos metodos
    List<Colecao> getByTema (String tema);
   // Colecao getColecaoByTema(String tema);
    Colecao getColecaoByTema(String tema);
}

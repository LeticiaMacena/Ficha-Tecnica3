/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Colecao;
import br.com.model.persistencia.dao.ColecaoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author User
 */
public class ColecaoDAOImpl extends DAOImpl<Colecao, Integer> implements ColecaoDAO{

    @Override
    public List<Colecao> getByTema(String tema) {
          return getEntityManager().createQuery("select m from Colecao m where m.tema like '%" + tema + "%'").getResultList();
    }

    @Override
    public Colecao getColecaoByTema(String tema) {
         Query q = getEntityManager().createQuery("select m from Colecao m where m.tema like '" + tema + "'", Colecao.class);
        List<Colecao> colecoes = q.getResultList();
        Colecao ma = new Colecao();
        for (Colecao m : colecoes) {
            ma = m;
        }
        return ma;

    }
    
 
  

}
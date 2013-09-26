/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Aviamento;
import br.com.model.persistencia.dao.AviamentoDAO;
import java.util.List;
import javax.persistence.Query;


  
/**
 *
 * @author User
 */
public class AviamentoDAOImpl extends DAOImpl<Aviamento, Integer> implements AviamentoDAO {
    
    
         public List<Aviamento> getByNome (String nome){
        return getEntityManager().createQuery("select m from Aviamento m where m.nome like '%" + nome + "%'").getResultList();
    }
     
      public Aviamento getAviamentoByNome(String nome) {
        Query q = getEntityManager().createQuery("select m from Aviamento m where m.nome like '" + nome + "'", Aviamento.class);
        List<Aviamento> aviamentos = q.getResultList();
        Aviamento ma = new Aviamento();
        for (Aviamento m : aviamentos) {
            ma = m;
        }
        return ma;

    }
 
   

}

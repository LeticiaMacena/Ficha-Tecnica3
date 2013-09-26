/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.persistencia;

import br.com.model.negocio.Tecido;
import br.com.model.persistencia.dao.TecidoDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author leticia_macena
 */
public class TecidoDAOImpl extends DAOImpl<Tecido, Integer> implements TecidoDAO {
    
    
        
         public List<Tecido> getByNome (String nome){
        return getEntityManager().createQuery("select m from Tecido m where m.nome like '%" + nome + "%'").getResultList();
         }
     
  
    @Override
    public List<Tecido> getByNomeDescricao(String nome, String descricao) {
          Query q = getEntityManager().createQuery("select m from Tecido m where m.nome like '" + nome +  "%' and u.telefone like '%" +  descricao + "%'", Tecido.class);
        List<Tecido> tecidos = q.getResultList();
        Tecido ma = new Tecido();
        for (Tecido m : tecidos) {
            ma = m;
        }
        return (List<Tecido>) ma;

    }
       

 
   

}

    


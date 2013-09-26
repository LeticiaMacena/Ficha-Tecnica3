/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Colecao;
import br.com.model.persistencia.ColecaoDAOImpl;
import br.com.model.persistencia.dao.ColecaoDAO;
import java.util.List;

/**
 *
 * @author User
 */
public class ColecaoController {
    
  
     public boolean salvar(Colecao colecao) {
        ColecaoDAO dao = new ColecaoDAOImpl();
       return dao.save(colecao);

    }

    public boolean excluir(int id) {
        ColecaoDAO dao = new ColecaoDAOImpl();
        return dao.remove(Colecao.class, id);

    }
    
    public List<Colecao> listarColecao() {
        ColecaoDAO dao = new ColecaoDAOImpl();
        return dao.getAll(Colecao.class);
    }
    
    public Colecao listarColecaoById (int id){
        ColecaoDAO dao = new ColecaoDAOImpl();
        return dao.getById(Colecao.class, id);
    }
    
   public List<Colecao> listarColecaoByTema (String tema){
        ColecaoDAO dao = new ColecaoDAOImpl();
        return dao.getByTema(tema);
    }       
   public Colecao listaColecaoByTema (String tema){
       ColecaoDAO dao = new ColecaoDAOImpl();
       return dao.getColecaoByTema(tema);
   }
        

}

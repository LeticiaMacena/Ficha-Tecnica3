/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Aviamento;
import br.com.model.persistencia.AviamentoDAOImpl;
import br.com.model.persistencia.dao.AviamentoDAO;
import java.util.List;

/**
 *
 * @author User
 */
public class AviamentoController {
       
     public boolean salvar(Aviamento aviamento) {
        AviamentoDAO dao = new AviamentoDAOImpl();
       return dao.save(aviamento);

    }

    public boolean excluir(int id) {
        AviamentoDAO dao = new AviamentoDAOImpl();
        return dao.remove(Aviamento.class, id);

    }
    
    public List<Aviamento> listarAviamento() {
        AviamentoDAO dao = new AviamentoDAOImpl();
        return dao.getAll(Aviamento.class);
    }
    
    public Aviamento listarAviamentoById (int id){
        AviamentoDAO dao = new AviamentoDAOImpl();
        return dao.getById(Aviamento.class, id);
    }
    
   public List<Aviamento> listarAviamentoByNome (String nome){
        AviamentoDAO dao = new AviamentoDAOImpl();
        return dao.getByNome(nome);
    }       
   public Aviamento listaAviamentoByNome (String nome){
       AviamentoDAO dao = new AviamentoDAOImpl();
       return dao.getAviamentoByNome(nome);
   }
        

}



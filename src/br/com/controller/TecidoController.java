/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controller;

import br.com.model.negocio.Tecido;
import br.com.model.persistencia.TecidoDAOImpl;
import br.com.model.persistencia.dao.TecidoDAO;
import java.util.List;

/**
 *
 * @author leticia_macena
 */
public class TecidoController {
     
     public boolean salvar(Tecido tecido) {
        TecidoDAO dao = new TecidoDAOImpl();
       return dao.save(tecido);

    }

    public boolean excluir(int id) {
        TecidoDAO dao = new TecidoDAOImpl();
        return dao.remove(Tecido.class, id);

    }
    
    public List<Tecido> listarTecido() {
        TecidoDAO dao = new TecidoDAOImpl();
        return dao.getAll(Tecido.class);
    }
    
    public Tecido listarTecidoById (int id){
        TecidoDAO dao = new TecidoDAOImpl();
        return dao.getById(Tecido.class, id);
    }
    
   public List<Tecido> listarTecidoByNomeDescricao(String nome, String descricao){
        TecidoDAO dao = new TecidoDAOImpl();
        return dao.getByNomeDescricao(nome, descricao);
    }      
   
   
     public List<Tecido> listarTecidoByNome(String nome){
        TecidoDAO dao = new TecidoDAOImpl();
        return dao.getByNome(nome);
   
//   public Tecido listaTecidoByDescricao(String descricao){
//       TecidoDAO dao = new TecidoDAOImpl();
//       return dao.getTecidoByNome(descricao);
  

}
}

        





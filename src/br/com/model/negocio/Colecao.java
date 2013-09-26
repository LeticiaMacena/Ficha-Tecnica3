/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.negocio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class Colecao implements Serializable {
      @Id
    @GeneratedValue
    private int id;
    private String tema;
    private String estacao;
    
    @ManyToOne
    @JoinColumn(name = "idFuncionario", referencedColumnName = "id")
    private Funcionario funcionarioReponsavel;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date DataAprovacaoModelo;
    private boolean genero;
    
     

    public String getTema() {
        return tema;
    }


    public Funcionario getFuncionarioReponsavel() {
        return funcionarioReponsavel;
    }

    public void setFuncionarioReponsavel(Funcionario funcionarioReponsavel) {
        this.funcionarioReponsavel = funcionarioReponsavel;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }


    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataAprovacaoModelo() {
        return DataAprovacaoModelo;
    }

    public void setDataAprovacaoModelo(Date DataAprovacaoModelo) {
        this.DataAprovacaoModelo = DataAprovacaoModelo;
    }

   

    
    
    



}


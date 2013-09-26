/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.negocio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author leticia_macena
 */
@Entity
public class Aviamento implements Serializable{
    
    @Id
    @GeneratedValue
    private  int  id;
    private String nome;
    private String cor;
    private String descricao;
    //exemplo linhas,ziperes...
    private String funcaoComponenteOuDecorativo;
  //  private String composicao;
    private String tamanho;
    private String Visibilidade;
    
    
    @ManyToOne
    @JoinColumn(name = "idfornecedor", referencedColumnName = "id")
    private Fornecedor fornecedor;
        @Override
    public String toString() {
        return   nome ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFuncaoComponenteOuDecorativo() {
        return funcaoComponenteOuDecorativo;
    }

    public void setFuncaoComponenteOuDecorativo(String funcaoComponenteOuDecorativo) {
        this.funcaoComponenteOuDecorativo = funcaoComponenteOuDecorativo;
    }
    

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisibilidade() {
        return Visibilidade;
    }

    public void setVisibilidade(String Visibilidade) {
        this.Visibilidade = Visibilidade;
    }
   
   
    
   
}

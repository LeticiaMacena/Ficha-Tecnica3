/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.negocio;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author User
 */
public class Tecido {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    // composição (percentual das fibras, para etiquetas de identificação)
    //  private String composicao;
    private String cor;
    private double tamanho;
    private String descricao ;
    
    @ManyToOne
    @JoinColumn(name = "idfornecedor", referencedColumnName = "id")
    private Fornecedor fornecedor;
        
   @Override
    public String toString() {
        return   nome ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
  
}


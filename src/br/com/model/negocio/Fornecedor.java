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
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author leticia_macena
 */

@Entity
public class Fornecedor implements Serializable{
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNacimento;
    private String login;
    private String sexo;
    private String senha;
 
    
    @Override
    public String toString() {
        return   nome ;
    }


    public Fornecedor() {
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNacimento() {
        return dataNacimento;
    }

    public void setDataNacimento(Date  dataNacimento) {
        this.dataNacimento = dataNacimento;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
  

}
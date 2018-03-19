/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 *
 * @author Marcos
 */


@Entity
public class Funcionario extends Pessoa implements Serializable{
    
    @Column(name="SALARIO_REF", length=100)
    protected int salarioRef;
    @Column(name="FUNCAO", length=100)
    protected String funcao;
    @Column(name="DATA_ADMISSAO", length=100)
    protected String dataAdmissao;
    @Column(name="DATA_DEMISSAO", length=100)
    protected String dataDemissao;
    @Column(name="LOGIN", length=100)
    protected String login;
    @Column(name="SENHA", length=100)
    protected int senha;
    



    public Funcionario() {
    }

    


    public String getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(String dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public int getSalarioRef() {
        return salarioRef;
    }

    public void setSalarioRef(int salarioRef) {
        this.salarioRef = salarioRef;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    
    
    
    
    
}

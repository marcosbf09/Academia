/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */

@Entity
@Table(name="FORNECEDOR")
public class Fornecedor implements Serializable {
    
    
    @Id
    private int cnpj;
    
    @Column(name="RAZAO_SOCIAL", length=100, nullable=false)
    private String razaoSocial;
    @Column(name="ENDERECO", length=100, nullable=false)
    private String endereco;
    @Column(name="TELEFONE", length=100, nullable=false)
    private int telefone;


    public Fornecedor() {
    }
    

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}

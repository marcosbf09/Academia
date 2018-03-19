/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



/**
 *
 * @author Marcos
 */

@Entity
public class Aluno extends Pessoa implements Serializable{
    
    
    @Column(name="MENSALIDADE_REF", length=100)
    private int mensalidadeRef;
    @Column(name="DATA_MATRICULA", length=100)
    private String dataMatricula;
    @Column(name="DATA_CANCEL_MATR", length=100)
    private String dataCancelMatr;

    

    public Aluno() {
    }


    public int getMensalidadeRef() {
        return mensalidadeRef;
    }

    public void setMensalidadeRef(int mensalidadeRef) {
        this.mensalidadeRef = mensalidadeRef;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getDataCancelMatr() {
        return dataCancelMatr;
    }

    public void setDataCancelMatr(String dataCancelMatr) {
        this.dataCancelMatr = dataCancelMatr;
    }
    
    
}

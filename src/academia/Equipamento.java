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
@Table(name="EQUIPAMENTO")
public class Equipamento implements Serializable {
    
    
    @Id
    private int codigo;
    @Column(name="DESCRICAO", length=100, nullable=false)
    private String descricao;
    @Column(name="TIPO_EQUIPAMENTO", length=100, nullable=false)
    private int tipoEquipamento;
    @Column(name="ESTADO", length=100, nullable=false)
    private String estado;

    public Equipamento() {
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(int tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}

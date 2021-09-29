/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Thiago Garcia
 */
@Entity
public class TipoUsuario implements Serializable {

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the descricaoTipoUsuario
     */
    public String getDescricaoTipoUsuario() {
        return descricaoTipoUsuario;
    }

    /**
     * @param descricaoTipoUsuario the descricaoTipoUsuario to set
     */
    public void setDescricaoTipoUsuario(String descricaoTipoUsuario) {
        this.descricaoTipoUsuario = descricaoTipoUsuario;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricaoTipoUsuario;
}

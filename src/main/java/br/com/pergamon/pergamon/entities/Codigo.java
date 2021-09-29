/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Thiago Garcia
 */
@Entity
public class Codigo {

    /**
     * @return the idcodigo
     */
    public long getIdcodigo() {
        return idcodigo;
    }

    /**
     * @param idcodigo the idcodigo to set
     */
    public void setIdcodigo(long idcodigo) {
        this.idcodigo = idcodigo;
    }

    /**
     * @return the codigo1
     */
    public boolean isCodigo1() {
        return codigo1;
    }

    /**
     * @param codigo1 the codigo1 to set
     */
    public void setCodigo1(boolean codigo1) {
        this.codigo1 = codigo1;
    }

    /**
     * @return the codigo2
     */
    public boolean isCodigo2() {
        return codigo2;
    }

    /**
     * @param codigo2 the codigo2 to set
     */
    public void setCodigo2(boolean codigo2) {
        this.codigo2 = codigo2;
    }

    /**
     * @return the codigo3
     */
    public boolean isCodigo3() {
        return codigo3;
    }

    /**
     * @param codigo3 the codigo3 to set
     */
    public void setCodigo3(boolean codigo3) {
        this.codigo3 = codigo3;
    }

    /**
     * @return the codigo4
     */
    public boolean isCodigo4() {
        return codigo4;
    }

    /**
     * @param codigo4 the codigo4 to set
     */
    public void setCodigo4(boolean codigo4) {
        this.codigo4 = codigo4;
    }

    /**
     * @return the codigo5
     */
    public boolean isCodigo5() {
        return codigo5;
    }

    /**
     * @param codigo5 the codigo5 to set
     */
    public void setCodigo5(boolean codigo5) {
        this.codigo5 = codigo5;
    }

    /**
     * @return the codigo6
     */
    public boolean isCodigo6() {
        return codigo6;
    }

    /**
     * @param codigo6 the codigo6 to set
     */
    public void setCodigo6(boolean codigo6) {
        this.codigo6 = codigo6;
    }

    /**
     * @return the codigo7
     */
    public boolean isCodigo7() {
        return codigo7;
    }

    /**
     * @param codigo7 the codigo7 to set
     */
    public void setCodigo7(boolean codigo7) {
        this.codigo7 = codigo7;
    }

    /**
     * @return the codigo8
     */
    public boolean isCodigo8() {
        return codigo8;
    }

    /**
     * @param codigo8 the codigo8 to set
     */
    public void setCodigo8(boolean codigo8) {
        this.codigo8 = codigo8;
    }

    /**
     * @return the codigo9
     */
    public boolean isCodigo9() {
        return codigo9;
    }

    /**
     * @param codigo9 the codigo9 to set
     */
    public void setCodigo9(boolean codigo9) {
        this.codigo9 = codigo9;
    }

    /**
     * @return the codigo10
     */
    public boolean isCodigo10() {
        return codigo10;
    }

    /**
     * @param codigo10 the codigo10 to set
     */
    public void setCodigo10(boolean codigo10) {
        this.codigo10 = codigo10;
    }

    /**
     * @return the codigo11
     */
    public boolean isCodigo11() {
        return codigo11;
    }

    /**
     * @param codigo11 the codigo11 to set
     */
    public void setCodigo11(boolean codigo11) {
        this.codigo11 = codigo11;
    }

    /**
     * @return the codigo12
     */
    public boolean isCodigo12() {
        return codigo12;
    }

    /**
     * @param codigo12 the codigo12 to set
     */
    public void setCodigo12(boolean codigo12) {
        this.codigo12 = codigo12;
    }

    /**
     * @return the codigo13
     */
    public boolean isCodigo13() {
        return codigo13;
    }

    /**
     * @param codigo13 the codigo13 to set
     */
    public void setCodigo13(boolean codigo13) {
        this.codigo13 = codigo13;
    }

    /**
     * @return the codigo14
     */
    public boolean isCodigo14() {
        return codigo14;
    }

    /**
     * @param codigo14 the codigo14 to set
     */
    public void setCodigo14(boolean codigo14) {
        this.codigo14 = codigo14;
    }

    /**
     * @return the codigo15
     */
    public boolean isCodigo15() {
        return codigo15;
    }

    /**
     * @param codigo15 the codigo15 to set
     */
    public void setCodigo15(boolean codigo15) {
        this.codigo15 = codigo15;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcodigo;
    private boolean codigo1;
    private boolean codigo2;
    private boolean codigo3;
    private boolean codigo4;
    private boolean codigo5;
    private boolean codigo6;
    private boolean codigo7;
    private boolean codigo8;
    private boolean codigo9;
    private boolean codigo10;
    private boolean codigo11;
    private boolean codigo12;
    private boolean codigo13;
    private boolean codigo14;
    private boolean codigo15;

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.services;

import br.com.pergamon.pergamon.entities.Codigo;
import java.util.List;

/**
 *
 * @author Thiago Garcia
 */
public interface CodigoServices {

    public void salvar(Codigo codigo);

    public Codigo buscarPorId(Long id);

    public List<Codigo> listarTodos();

    public void removerPorId(Long id);

}

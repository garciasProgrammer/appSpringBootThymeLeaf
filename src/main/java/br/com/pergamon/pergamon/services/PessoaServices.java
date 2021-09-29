/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.services;

import br.com.pergamon.pergamon.entities.Pessoa;
import java.util.List;

/**
 *
 * @author Thiago Garcia
 */
public interface PessoaServices {

    public void salvar(Pessoa person);

    public Pessoa buscarPorId(Long id);

    public List<Pessoa> listarTodos();

    public void removerPorId(Long id);

    public List<Pessoa> buscarPorFiltros(String nome, String coordenador, String engajamento);

}

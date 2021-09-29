/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.services;

import br.com.pergamon.pergamon.entities.Pessoa;
import br.com.pergamon.pergamon.repositoryes.PessoaRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thiago Garcia
 */
@Service
public class PessoaServicesImpl implements PessoaServices {

    private PessoaRepository pessoaRepository;

    public PessoaServicesImpl(PessoaRepository codigoRepository) {
        this.pessoaRepository = codigoRepository;
    }

    @Override
    public void salvar(Pessoa person) {
        this.pessoaRepository.save(person);
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        Optional<Pessoa> o = this.pessoaRepository.findById(id);

        return o.get();

    }

    @Override
    public List<Pessoa> listarTodos() {
        List<Pessoa> pessoas = new ArrayList<>();
        Iterator<Pessoa> iterator = this.pessoaRepository.findAll().iterator();
        while (iterator.hasNext()) {
            pessoas.add(iterator.next());
        }
        return pessoas;
    }

    @Override
    public void removerPorId(Long id) {
        this.pessoaRepository.deleteById(id);

    }

    @Override
    public List<Pessoa> buscarPorFiltros(String nome, String coordenador, String engajamento) {
        List<Pessoa> pessoas = new ArrayList<>();
        Iterator<Pessoa> iterator = this.pessoaRepository.findByFilters(nome, coordenador, engajamento).iterator();
        while (iterator.hasNext()) {
            pessoas.add(iterator.next());
        }
        return pessoas;
    }

}

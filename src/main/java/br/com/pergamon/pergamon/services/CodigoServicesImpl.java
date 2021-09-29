/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.services;

import br.com.pergamon.pergamon.entities.Codigo;
import br.com.pergamon.pergamon.repositoryes.CodigoRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Thiago Garcia
 */
@Service
public class CodigoServicesImpl implements CodigoServices {

    private CodigoRepository codigoRepository;

    public CodigoServicesImpl(CodigoRepository codigoRepository) {
        this.codigoRepository = codigoRepository;
    }

    @Override
    public void salvar(Codigo codigo) {
        this.codigoRepository.save(codigo);
    }

    @Override
    public Codigo buscarPorId(Long id) {
        Optional<Codigo> o = this.codigoRepository.findById(id);

        return o.get();

    }

    @Override
    public List<Codigo> listarTodos() {
        List<Codigo> codigos = new ArrayList<>();
        Iterator<Codigo> iterator = this.codigoRepository.findAll().iterator();
        while (iterator.hasNext()) {
            codigos.add(iterator.next());
        }
        return codigos;
    }

    @Override
    public void removerPorId(Long id) {
        this.codigoRepository.deleteById(id);
    }

}

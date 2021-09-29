/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.repositoryes;

import br.com.pergamon.pergamon.entities.Pessoa;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Thiago Garcia
 */
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p where p.nome like %?1% AND p.coordenador like %?2% AND p.engajamento like %?3%")
    List<Pessoa> findByFilters(String nome, String coordenador, String engajamento);

}

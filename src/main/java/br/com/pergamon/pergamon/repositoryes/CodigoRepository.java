/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.repositoryes;

import br.com.pergamon.pergamon.entities.Codigo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thiago Garcia
 */
@Repository
public interface CodigoRepository extends CrudRepository<Codigo, Long> {
    
    

}

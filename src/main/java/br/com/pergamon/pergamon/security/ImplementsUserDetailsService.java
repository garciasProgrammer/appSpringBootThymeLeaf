/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.security;

import br.com.pergamon.pergamon.entities.Login;
import br.com.pergamon.pergamon.repositoryes.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Thiago Garcia
 */
@Repository
public class ImplementsUserDetailsService implements UserDetailsService{

    @Autowired
   private  LoginRepository loginRepository;
    
    @Override
    public UserDetails loadUserByUsername(String usuario) throws UsernameNotFoundException {
       Login login = loginRepository.findByLogin(usuario);
       
       if(login== null){
           throw new UsernameNotFoundException("Usuario nao encontrado");
       }
       return login;
    }
    
}

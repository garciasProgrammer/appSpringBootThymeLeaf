/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Thiago Garcia
 */
@Controller
public class helloWorld {
    
    @RequestMapping("/hello")
    public String helloWorld(){
    return "/testeFormulario";
    }
    
}

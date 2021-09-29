/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pergamon.pergamon.controllers;

import br.com.pergamon.pergamon.entities.Codigo;
import br.com.pergamon.pergamon.entities.Pessoa;
import br.com.pergamon.pergamon.services.CodigoServices;
import br.com.pergamon.pergamon.services.PessoaServices;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Thiago Garcia
 */
@Controller
@RequestMapping("/pessoa")
public class PessoaController {

    private PessoaServices pessoasServices;
    private CodigoServices codigoServices;

    public PessoaController(PessoaServices pessoasServices) {
        this.pessoasServices = pessoasServices;
    }

    @GetMapping("/listar")
    public String listar(Model model) {

        model.addAttribute("pessoas", pessoasServices.listarTodos());

        return "/pessoa/listar";
    }

    @PostMapping("/filtros")
    public String filtros(Model model, @RequestParam("nomePesquisado") String nomePesquisado,
            @RequestParam("coordPesquisa") String coordPesquisa, @RequestParam("engPesquisa") String engPesquisa) {
        model.addAttribute("pessoas", new Pessoa());
        model.addAttribute("pessoas", pessoasServices.buscarPorFiltros(nomePesquisado, coordPesquisa, engPesquisa));

        return "/pessoa/listar";
    }

    @GetMapping("/novo")
    public ModelAndView novo() {

        ModelAndView mv = new ModelAndView("/pessoa/FormularioCadastro");
        mv.addObject("pessoa", new Pessoa());
        mv.addObject("codigo", new Codigo());
        return mv;

    }

    @PostMapping("/salvar")
    public ModelAndView salvar(@Valid Pessoa pessoa, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {

           
            ModelAndView mv = new ModelAndView("/pessoa/FormularioCadastro");
            mv.addObject("pessoa", pessoa);

            List<String> msg = new ArrayList<>();
            result.getAllErrors().forEach((objError) -> {
                msg.add(objError.getDefaultMessage()+"\n");
            });
            mv.addObject("mensagemErro", msg);
            return mv;
        }

        pessoasServices.salvar(pessoa);

        ModelAndView mv = new ModelAndView("/pessoa/FormularioCadastro");
        mv.addObject("pessoa", pessoa);
        mv.addObject("mensagem", "Contato salvo com sucesso!");
        return mv;

    }

    @GetMapping("{id}/editar")
    public ModelAndView editar(@PathVariable("id") Long id) {
        ModelAndView mv = new ModelAndView("/pessoa/FormularioCadastro");
        mv.addObject("pessoa", pessoasServices.buscarPorId(id));

        return mv;

    }

    @GetMapping("{id}/excluir")
    public String excluir(@PathVariable("id") Long id, Model model) {

        pessoasServices.removerPorId(id);

        return "/pessoa/listar";

    }
}

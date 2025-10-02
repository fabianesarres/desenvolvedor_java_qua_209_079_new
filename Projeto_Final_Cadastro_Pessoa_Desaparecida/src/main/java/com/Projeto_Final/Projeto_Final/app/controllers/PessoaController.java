package com.Projeto_Final.Projeto_Final.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.Projeto_Final.Projeto_Final.app.models.Pessoa;
import com.Projeto_Final.Projeto_Final.app.repository.PessoaRepository;

@Controller
public class PessoaController {

    private final PessoaRepository repository;

    public PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }

    
    @GetMapping("/cadastrarPessoaDesaparecida")
    public String salvar(Model model) {
        model.addAttribute("usuario", new Pessoa());
        return "cadastrarPessoaDesaparecida"; 
    }

    
    @PostMapping("/cadastrarPessoaDesaparecida")
    public String salvar(@ModelAttribute("usuario") Pessoa usuario) {
        repository.save(usuario);
        return "redirect:/listarUsuarios";
    }

    
    @GetMapping("/listarUsuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "listarUsuarios";
    }

  
    @GetMapping("/cadastrarUsuario")
    public String cadastrarUsuarioForm() {
        return "cadastrarUsuario";
    }
}
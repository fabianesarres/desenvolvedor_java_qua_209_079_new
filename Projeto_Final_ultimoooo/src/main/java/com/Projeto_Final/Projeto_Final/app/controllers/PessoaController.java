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

    @GetMapping("/")
    public String index() {
        return "index";
    }


    @GetMapping("/cadastrarUsuario")
    public String cadastrarUsuarioForm(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "cadastrar";
    }

    @PostMapping("/cadastrarUsuario")
    public String salvar(@ModelAttribute Pessoa pessoa) {
        repository.save(pessoa);
        return "redirect:/listarUsuarios";
    }

    @GetMapping("/listarUsuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", repository.findAll());
        return "listar";
    }
}

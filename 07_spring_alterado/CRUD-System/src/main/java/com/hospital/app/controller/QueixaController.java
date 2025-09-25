package com.hospital.app.controller;

import com.hospital.app.model.Paciente;
import com.hospital.app.model.Queixa;
import com.hospital.app.repository.PacienteRepository;
import com.hospital.app.repository.QueixaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/queixas")
public class QueixaController {
    @Autowired
    private QueixaRepository queixaRepository;
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public String listarQueixas(Model model) {
        model.addAttribute("queixas", queixaRepository.findAll());
        return "queixas/listar";
    }

    @GetMapping("/cadastrar")
    public String exibirFormularioCadastro(Model model) {
        model.addAttribute("queixa", new Queixa());
        model.addAttribute("pacientes", pacienteRepository.findAll());
        return "queixas/cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarQueixa(@ModelAttribute Queixa queixa) {
        queixaRepository.save(queixa);
        return "redirect:/queixas";
    }
}

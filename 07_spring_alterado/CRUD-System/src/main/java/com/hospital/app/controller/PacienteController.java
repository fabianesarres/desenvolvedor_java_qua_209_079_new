package com.hospital.app.controller;

import com.hospital.app.model.Paciente;
import com.hospital.app.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", pacienteRepository.findAll());
        return "pacientes/listar";
    }

    @GetMapping("/cadastrar")
    public String exibirFormularioCadastro(Paciente paciente) {
        return "pacientes/cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
        return "redirect:/pacientes";
    }
}

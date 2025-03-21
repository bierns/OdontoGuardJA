package br.com.sprint3.odontoGuardJA.controllers;

import br.com.sprint3.odontoGuardJA.models.Paciente;
import br.com.sprint3.odontoGuardJA.repositories.PacienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteRepository pacienteRepository;

    public PacienteController(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @GetMapping
    public String listarPacientes(Model model) {
        model.addAttribute("pacientes", pacienteRepository.findAll());
        return "pacientes";
    }

    @PostMapping("/salvar")
    public String salvarPaciente(@ModelAttribute Paciente paciente) {
        pacienteRepository.save(paciente);
        return "redirect:/pacientes";
    }
}

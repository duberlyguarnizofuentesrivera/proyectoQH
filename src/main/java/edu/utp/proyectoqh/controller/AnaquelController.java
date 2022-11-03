package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.AnaquelRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AnaquelController {
    private final AnaquelRepository anaquelRepository;

    public AnaquelController(AnaquelRepository anaquelRepository) {
        this.anaquelRepository = anaquelRepository;
    }

    @GetMapping("/pages/anaqueles")
    public String anaquelListado() {
        return "pages/anaqueles";
    }

    @GetMapping("/pages/anaqueles/{id}")
    public String anaquelDetalle(@PathVariable("id") Long id, Model model) {
        model.addAttribute("id", id);
        anaquelRepository.findById(id).ifPresent(anaquel -> model.addAttribute("anaquel", anaquel));
        return "pages/anaquel-detalle";
    }
}

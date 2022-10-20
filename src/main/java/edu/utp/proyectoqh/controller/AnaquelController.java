package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnaquelController {
    @GetMapping("/pages/anaqueles")
    public String anaquelListado() {
        return "pages/anaqueles";
    }
}

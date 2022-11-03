package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    public PersonaController() {

    }

    @GetMapping("/pages/personas")
    public String personaListado() {
        return "pages/personas";
    }
}

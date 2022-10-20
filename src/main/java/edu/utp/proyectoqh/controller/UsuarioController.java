package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
    @GetMapping("/pages/usuarios")
    public String usuarioListado() {
        return "pages/usuarios";
    }
}

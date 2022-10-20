package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {
    @GetMapping("/pages/categorias")
    public String categoriaListado() {
        return "pages/categorias";
    }
}

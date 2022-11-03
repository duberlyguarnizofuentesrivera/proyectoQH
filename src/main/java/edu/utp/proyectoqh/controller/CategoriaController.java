package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoriaController {

    private final CategoriaRepository categoriaRepository;

    public CategoriaController(CategoriaRepository categoriaRepository) {

        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/pages/categorias")
    public String categoriaListado() {
        return "pages/categorias";
    }
}

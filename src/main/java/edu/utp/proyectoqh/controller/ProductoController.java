package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {
    @GetMapping("/pages/productos")
    public String productoListado() {
        return "pages/productos";
    }
}
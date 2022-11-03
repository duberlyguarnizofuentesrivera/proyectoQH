package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.ProductoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductoController {

    private final ProductoRepository productoRepository;

    public ProductoController(ProductoRepository productoRepository) {

        this.productoRepository = productoRepository;
    }

    @GetMapping("/pages/productos")
    public String productoListado() {
        return "pages/productos";
    }
}

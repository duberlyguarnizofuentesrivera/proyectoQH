package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProveedorController {
    @GetMapping("/pages/proveedores")
    public String productoListado() {
        return "pages/proveedores";
    }
}

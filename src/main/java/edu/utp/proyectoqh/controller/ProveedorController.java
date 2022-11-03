package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.ProveedorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProveedorController {
    private final ProveedorRepository proveedorRepository;

    public ProveedorController(ProveedorRepository proveedorRepository) {

        this.proveedorRepository = proveedorRepository;
    }

    @GetMapping("/pages/proveedores")
    public String proveedorListado() {
        return "pages/proveedores";
    }
}

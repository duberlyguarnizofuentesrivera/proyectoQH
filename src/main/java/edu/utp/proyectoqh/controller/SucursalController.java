package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.SucursalRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SucursalController {
    private final SucursalRepository sucursalRepository;

    public SucursalController(SucursalRepository sucursalRepository) {

        this.sucursalRepository = sucursalRepository;
    }

    @GetMapping("/pages/sucursales")
    public String sucursalListado() {
        return "pages/sucursales";
    }
}

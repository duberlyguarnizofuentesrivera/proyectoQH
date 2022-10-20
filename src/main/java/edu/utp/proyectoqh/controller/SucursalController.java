package edu.utp.proyectoqh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SucursalController {
    @GetMapping("/pages/sucursales")
    public String sucursalListado() {
        return "pages/sucursales";
    }
}

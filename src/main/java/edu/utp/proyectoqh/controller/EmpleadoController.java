package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoController {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @GetMapping("/pages/usuarios")
    public String empleadoListado() {
        return "pages/usuarios";
    }

    @GetMapping("/pages/usuarios-nuevo")
    public String nuevoEmpleado() {
        return "pages/usuarios-nuevo";
    }
}

package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.EmpleadoRepository;
import org.springframework.stereotype.Controller;

@Controller
public class EmpleadoController {
    private final EmpleadoRepository empleadoRepository;

    public EmpleadoController(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }
}

package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.RegistroIngresoRepository;
import org.springframework.stereotype.Controller;

@Controller
public class RegistroIngresoController {

    private final RegistroIngresoRepository registroIngresoRepository;

    public RegistroIngresoController(RegistroIngresoRepository registroIngresoRepository) {

        this.registroIngresoRepository = registroIngresoRepository;
    }
}

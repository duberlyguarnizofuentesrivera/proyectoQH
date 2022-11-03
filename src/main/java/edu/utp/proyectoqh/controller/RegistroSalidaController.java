package edu.utp.proyectoqh.controller;

import edu.utp.proyectoqh.repository.RegistroSalidaRepository;
import org.springframework.stereotype.Controller;

@Controller
public class RegistroSalidaController {

    private final RegistroSalidaRepository registroSalidaRepository;

    public RegistroSalidaController(RegistroSalidaRepository registroSalidaRepository) {

        this.registroSalidaRepository = registroSalidaRepository;
    }
}

package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    List<Persona> findByNombres(String nombre);

    List<Persona> findByApellidos(String apellido);

    List<Persona> findByDni(String dni);
}

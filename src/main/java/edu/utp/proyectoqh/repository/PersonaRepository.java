package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Persona;
import org.apache.deltaspike.data.api.EntityRepository;

import java.util.List;

public interface PersonaRepository extends EntityRepository<Persona, Long> {
    List<Persona> findByNombres(String nombre);
    List<Persona> findByApellidos(String apellido);
    List<Persona> findByDni(String dni);
    Persona findById(Long id);
}

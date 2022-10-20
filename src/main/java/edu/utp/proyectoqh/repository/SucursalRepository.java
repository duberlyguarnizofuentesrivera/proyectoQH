package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal, Long> {
    Sucursal findByNombre(String nombre);

    Sucursal findByPersonaId_Id(Long personaId);
}

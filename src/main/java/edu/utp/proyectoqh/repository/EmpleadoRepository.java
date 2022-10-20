package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByPersonaId_Nombres(String nombre);

    List<Empleado> findByPersonaId_Apellidos(String apellido);

    List<Empleado> findByPersonaId_Dni(String dni);

    List<Empleado> findByRolId_Id(Long id);
}

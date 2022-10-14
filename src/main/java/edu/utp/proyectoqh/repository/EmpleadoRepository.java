package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Empleado;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends EntityRepository<Empleado, Long> {
    List<Empleado> findByPersonaId_Nombres(String nombre);

    List<Empleado> findByPersonaId_Apellidos(String apellido);

    List<Empleado> findByPersonaId_Dni(String dni);

    List<Empleado> findByRol_Nombre(String rol);

    Empleado findById(Long id);
}

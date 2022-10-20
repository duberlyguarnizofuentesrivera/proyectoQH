package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.RegistroIngreso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroIngresoRepository extends JpaRepository<RegistroIngreso, Long> {
    List<RegistroIngreso> findByDniTransportista(String dniTransportista);

    List<RegistroIngreso> findByEmpleadoId_Id(Long empleadoId);
}

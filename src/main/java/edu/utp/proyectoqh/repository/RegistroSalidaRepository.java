package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.RegistroSalida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroSalidaRepository extends JpaRepository<RegistroSalida, Long> {
    List<RegistroSalida> findByDniTransportista(String dniTransportista);

    List<RegistroSalida> findByEmpleadoId_Id(Long empleadoId);

    List<RegistroSalida> findBySucursalId_Id(Long sucursalId);
}

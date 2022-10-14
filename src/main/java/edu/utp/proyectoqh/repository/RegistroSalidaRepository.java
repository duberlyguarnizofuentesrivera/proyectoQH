package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.RegistroSalida;
import org.apache.deltaspike.data.api.EntityRepository;

import java.util.List;

public interface RegistroSalidaRepository extends EntityRepository<RegistroSalida, Long> {
    RegistroSalida findById(Long id);
    List<RegistroSalida> findByDniTransportista(String dniTransportista);
    List<RegistroSalida> findByEmpleadoId_Id(Long empleadoId);
    List<RegistroSalida> findBySucursalId_Id(Long sucursalId);
}

package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.RegistroIngreso;
import org.apache.deltaspike.data.api.EntityRepository;

import java.util.List;

public interface RegistroIngresoRepository extends EntityRepository<RegistroIngreso, Long> {
    RegistroIngreso findById(Long id);
    List<RegistroIngreso> findByDniTransportista(String dniTransportista);
    List<RegistroIngreso> findByEmpleadoId_Id(Long empleadoId);
}

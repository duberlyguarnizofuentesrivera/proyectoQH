package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Sucursal;
import org.apache.deltaspike.data.api.EntityRepository;

public interface SucursalRepository extends EntityRepository<Sucursal, Long> {
    Sucursal findById(Long id);
    Sucursal findByNombre(String nombre);
    Sucursal findByPersonaId_Id(Long personaId);

}

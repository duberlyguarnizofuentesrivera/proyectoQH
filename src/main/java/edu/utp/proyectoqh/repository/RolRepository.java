package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Rol;
import org.apache.deltaspike.data.api.EntityRepository;

public interface RolRepository extends EntityRepository<Rol, Long> {
    Rol findById(Long id);
}

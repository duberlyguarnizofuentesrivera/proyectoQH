package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Anaquel;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface AnaquelRepository extends EntityRepository<Anaquel, Long> {
    List<Anaquel> findByPiso(int piso);

    Anaquel findById(Long id);

    List<Anaquel> findByPasillo(int pasillo);

    List<Anaquel> findByNivel(int nivel);
}

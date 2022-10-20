package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Anaquel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnaquelRepository extends JpaRepository<Anaquel, Long> {
    List<Anaquel> findByPiso(int piso);

    List<Anaquel> findByPasillo(int pasillo);

    List<Anaquel> findByNivel(int nivel);
}

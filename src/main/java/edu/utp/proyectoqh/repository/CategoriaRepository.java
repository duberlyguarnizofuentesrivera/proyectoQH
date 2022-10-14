package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Categoria;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends EntityRepository<Categoria, Long> {
    List<Categoria> findByNombre(String nombre);
    Categoria findById(Long id);
}

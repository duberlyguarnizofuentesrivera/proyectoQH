package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Producto;
import org.apache.deltaspike.data.api.EntityRepository;

import java.util.List;

public interface ProductoRepository extends EntityRepository<Producto, Long> {
    List<Producto> findByNombre(String nombre);
    List<Producto> findByStock(int stock);
    List<Producto> findByCategoriaId_Nombre(String nombre);
    List<Producto> findByCategoriaId_Id(Long id);
    List<Producto> findByAnaquelId_Piso(int piso);
    List<Producto> findByAnaquelId_Pasillo(int pasillo);
    List<Producto> findByAnaquelId_Nivel(int nivel);
    List<Producto> findByAnaquelId_Id(Long id);
    Producto findById(Long id);
}

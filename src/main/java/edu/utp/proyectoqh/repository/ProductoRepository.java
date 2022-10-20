package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombre(String nombre);

    List<Producto> findByStock(double stock);

    List<Producto> findByCategoriaId_Nombre(String nombre);

    List<Producto> findByCategoriaId_Id(Long id);

    List<Producto> findByAnaquelId_Piso(int piso);

    List<Producto> findByAnaquelId_Pasillo(int pasillo);

    List<Producto> findByAnaquelId_Nivel(int nivel);

    List<Producto> findByAnaquelId_Id(Long id);
}

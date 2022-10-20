package edu.utp.proyectoqh.repository;

import edu.utp.proyectoqh.model.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProveedorRepository extends JpaRepository<Proveedor, Long> {
    List<Proveedor> findByRazonSocial(String razonSocial);

    List<Proveedor> findByRuc(String ruc);
}

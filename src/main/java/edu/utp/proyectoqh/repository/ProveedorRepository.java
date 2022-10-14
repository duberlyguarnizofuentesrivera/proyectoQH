package edu.utp.plataformaqh.repository;

import edu.utp.plataformaqh.entity.Proveedor;
import org.apache.deltaspike.data.api.EntityRepository;

import java.util.List;

public interface ProveedorRepository extends EntityRepository<Proveedor, Long> {
    List<Proveedor> findByRazonSocial(String razonSocial);
    List<Proveedor> findByRuc(String ruc);
    Proveedor findById(Long id);
}

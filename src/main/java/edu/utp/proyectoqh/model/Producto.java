package edu.utp.plataformaqh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "productos")
    private Set<Anaquel> anaquelId;
    @ManyToMany(mappedBy = "productos")
    private Set<Categoria> categoriaId;
    @ManyToMany(mappedBy = "productos")
    private Set<Proveedor> proveedorId;
    @ManyToMany(mappedBy = "productos")
    private Set<RegistroIngreso> registroIngresos;
    @ManyToMany(mappedBy = "productos")
    private Set<RegistroSalida> registroSalidas;
    private String nombre;
    private String estado;
    private double stock;
}

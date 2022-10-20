package edu.utp.proyectoqh.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Anaquel> anaquelId;
    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Categoria> categoriaId;
    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Proveedor> proveedorId;
    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<RegistroIngreso> registroIngresos;
    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<RegistroSalida> registroSalidas;
    private String nombre;
    private String estado;
    private double stock;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Producto producto = (Producto) o;
        return id != null && Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

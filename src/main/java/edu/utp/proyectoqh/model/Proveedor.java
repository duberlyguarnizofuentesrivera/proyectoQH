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
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Persona personaId;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "proveedor_producto", joinColumns = {@JoinColumn(name = "proveedor_id")}, inverseJoinColumns = {@JoinColumn(name = "producto_id")})
    @ToString.Exclude

    private Set<Producto> productos;
    @Column(nullable = false, unique = true)
    private String razonSocial;
    @Column(nullable = false, unique = true)
    private String ruc;
    private String direccion;
    private String telefono;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Proveedor proveedor = (Proveedor) o;
        return id != null && Objects.equals(id, proveedor.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

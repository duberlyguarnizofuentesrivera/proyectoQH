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
public class RegistroSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Empleado empleadoId;
    @ManyToOne
    private Sucursal sucursalId;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "salidas_productos",
            joinColumns = {@JoinColumn(name = "registro_salida_id")},
            inverseJoinColumns = {@JoinColumn(name = "productos_id")}
    )
    @ToString.Exclude
    private Set<Producto> productos;
    private String nombreTransportista;
    @Column(unique = true, nullable = false)
    private String dniTransportista;
    private double cantidad;
    private String obs;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RegistroSalida that = (RegistroSalida) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

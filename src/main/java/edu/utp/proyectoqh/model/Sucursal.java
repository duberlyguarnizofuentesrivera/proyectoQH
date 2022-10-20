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
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(optional = false)
    private Persona personaId;
    @OneToMany(mappedBy = "sucursalId")
    @ToString.Exclude
    private Set<RegistroSalida> salidas;
    @Column(nullable = false)
    private String nombre;
    private String telefono;
    private String direccion;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Sucursal sucursal = (Sucursal) o;
        return id != null && Objects.equals(id, sucursal.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

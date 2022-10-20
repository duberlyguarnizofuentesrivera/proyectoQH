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
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(optional = false)
    private Persona personaId;
    @ManyToOne(optional = false)
    @JoinColumn(nullable = false)
    private Rol rolId;
    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<RegistroIngreso> listaIngresos;
    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    private Set<RegistroSalida> listaEgresos;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Empleado empleado = (Empleado) o;
        return id != null && Objects.equals(id, empleado.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

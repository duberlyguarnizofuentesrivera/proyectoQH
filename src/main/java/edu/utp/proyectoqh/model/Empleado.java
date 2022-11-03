package edu.utp.proyectoqh.model;

import edu.utp.proyectoqh.enums.UserRol;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.HashSet;
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

    @Enumerated(EnumType.STRING)
    private UserRol rol;

    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    private Set<RegistroIngreso> listaIngresos = new HashSet<>();

    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = false)
    @ToString.Exclude
    private Set<RegistroSalida> listaEgresos = new HashSet<>();

    @CreationTimestamp
    private LocalDateTime fechaCreado;

    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

package edu.utp.plataformaqh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
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
    private Set<RegistroIngreso> listaIngresos;
    @OneToMany(mappedBy = "empleadoId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<RegistroSalida> listaEgresos;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;

}

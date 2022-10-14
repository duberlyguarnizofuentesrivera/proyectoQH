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
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(optional = false)
    private Persona personaId;
    @OneToMany(mappedBy = "sucursalId")
    private Set<RegistroSalida> salidas;
    @Column(nullable = false)
    private String nombre;
    private String telefono;
    private String direccion;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

package edu.utp.proyectoqh.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
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

    @ToString.Exclude
    @OneToOne(optional = false)
    private Persona personaId;

    @OneToMany(mappedBy = "sucursalId")
    @ToString.Exclude
    private Set<RegistroSalida> salidas;

    @NotBlank
    private String nombre;

    private String telefono;

    private String direccion;

    @CreationTimestamp
    private LocalDateTime fechaCreado;

    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

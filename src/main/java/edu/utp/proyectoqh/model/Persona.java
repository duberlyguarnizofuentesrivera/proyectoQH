package edu.utp.plataformaqh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String dni;
    @Column(nullable = false)
    private String nombres;
    @Column(nullable = false)
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

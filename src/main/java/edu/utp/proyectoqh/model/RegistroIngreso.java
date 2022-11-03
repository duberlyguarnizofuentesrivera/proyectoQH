package edu.utp.proyectoqh.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
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
public class RegistroIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @ManyToOne
    private Empleado empleadoId;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "ingresos_productos",
            joinColumns = {@JoinColumn(name = "registro_ingreso_id")},
            inverseJoinColumns = {@JoinColumn(name = "productos_id")})
    @ToString.Exclude
    private Set<Producto> productos = new HashSet<>();

    @NotBlank
    private String nombreTransportista;

    @NotBlank
    private String dniTransportista;

    @Positive
    private double cantidad;

    private String obs;

    @CreationTimestamp
    private LocalDateTime fechaCreado;

    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

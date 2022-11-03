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
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Anaquel> anaquelId = new HashSet<>();

    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Categoria> categoriaId = new HashSet<>();

    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<Proveedor> proveedorId = new HashSet<>();

    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<RegistroIngreso> registroIngresos = new HashSet<>();

    @ManyToMany(mappedBy = "productos")
    @ToString.Exclude
    private Set<RegistroSalida> registroSalidas = new HashSet<>();

    @NotBlank
    private String nombre;

    private String estado;

    @Positive
    private double stock;

    @CreationTimestamp
    private LocalDateTime fechaCreado;

    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

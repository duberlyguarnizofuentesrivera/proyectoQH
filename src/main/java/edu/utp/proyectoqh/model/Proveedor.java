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
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ToString.Exclude
    @OneToOne
    private Persona personaId;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "proveedor_producto", joinColumns = {@JoinColumn(name = "proveedor_id")}, inverseJoinColumns = {@JoinColumn(name = "producto_id")})
    @ToString.Exclude
    private Set<Producto> productos;

    @NotBlank
    private String razonSocial;

    @NotBlank
    private String ruc;

    private String direccion;

    private String telefono;

    @CreationTimestamp
    private LocalDateTime fechaCreado;

    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

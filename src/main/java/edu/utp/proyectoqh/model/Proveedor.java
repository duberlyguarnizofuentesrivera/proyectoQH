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
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Persona personaId;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "proveedor_producto", joinColumns = {@JoinColumn(name = "proveedor_id")}, inverseJoinColumns = {@JoinColumn(name = "producto_id")})

    private Set<Producto> productos;
    @Column(nullable = false, unique = true)
    private String razonSocial;
    @Column(nullable = false, unique = true)
    private String ruc;
    private String direccion;
    private String telefono;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

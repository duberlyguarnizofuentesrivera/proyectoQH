package edu.utp.plataformaqh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nombre;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "categoria_producto", joinColumns = {@JoinColumn(name = "categoria_id")}, inverseJoinColumns = {@JoinColumn(name = "producto_id")})
    private Set<Producto> productos;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

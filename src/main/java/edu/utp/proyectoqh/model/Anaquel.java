package edu.utp.plataformaqh.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Anaquel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int piso;
    @Column(nullable = false)
    private int pasillo;
    private int nivel;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "anaquel_producto", joinColumns = {@JoinColumn(name = "anaquel_id")}, inverseJoinColumns = {@JoinColumn(name = "producto_id")})
    private Set<Producto> productos;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

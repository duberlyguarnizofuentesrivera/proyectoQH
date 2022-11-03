package edu.utp.proyectoqh.model;

import jakarta.persistence.*;
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
    @ToString.Exclude
    private Set<Producto> productos = new HashSet<>();
    @CreationTimestamp
    private LocalDateTime fechaCreado;
    @UpdateTimestamp
    private LocalDateTime fechaModificado;
}

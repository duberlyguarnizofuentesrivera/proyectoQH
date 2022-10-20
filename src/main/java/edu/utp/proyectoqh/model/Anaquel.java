package edu.utp.proyectoqh.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
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
    private Set<Producto> productos;
    @Column(updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Anaquel anaquel = (Anaquel) o;
        return id != null && Objects.equals(id, anaquel.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}

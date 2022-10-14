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
public class RegistroIngreso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Empleado empleadoId;
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "ingresos_productos",
            joinColumns = {@JoinColumn(name = "registro_ingreso_id")},
            inverseJoinColumns = {@JoinColumn(name = "productos_id")}
    )
    private Set<Producto> productos;
    private String nombreTransportista;
    @Column(unique = true, nullable = false)
    private String dniTransportista;
    private double cantidad;
    private String obs;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaCreado;
}

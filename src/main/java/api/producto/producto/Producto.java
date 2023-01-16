package api.producto.producto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data

public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nombre;
    private String codigo;
    private double precio;

    
}

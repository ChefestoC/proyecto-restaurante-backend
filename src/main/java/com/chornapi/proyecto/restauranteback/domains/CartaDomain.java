package com.chornapi.proyecto.restauranteback.domains;


import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_CARTA)
public class CartaDomain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_carta")
    private short codCarta;

    @Column(name="nombreCarta")
    private String carta;

    @Column(name="fec_registro")
    private Date fecha;

    @Column(name="activa")
    private boolean activa;

}

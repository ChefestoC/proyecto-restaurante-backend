package com.chornapi.proyecto.restauranteback.domains;

import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_CARTA_DETALLE)
public class CartaDetalleDomain {


    @EmbeddedId
    private CartaDetalleId id;

    @Column(name = "activo")
    private boolean activo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_carta")
    private CartaDomain carta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private ProductoDomain producto;
}

package com.chornapi.proyecto.restauranteback.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class CartaDetalleId implements Serializable {

    @Column(name = "id_carta", insertable=false, updatable=false)
    private short carta;

    @Column(name = "id_producto", insertable=false, updatable=false)
    private short producto;
}

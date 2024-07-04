package com.chornapi.proyecto.restauranteback.domains;

import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_VENTA_DETALLE)
public class VentaDetalleDomain {

    @EmbeddedId
    private VentaDetalleId id;

    @Column(name="cantidad")
    private short cantidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="id_dia"),
            @JoinColumn(name="id_mesa"),
            @JoinColumn(name="fec_atencion")
    })
    private VentaDomain venta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_estado")
    private EstadoVentaDomain estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="id_carta"),
            @JoinColumn(name="id_producto")
    })
    private CartaDetalleDomain cartaDetalle;
}

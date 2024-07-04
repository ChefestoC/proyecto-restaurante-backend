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
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_VENTA)
public class VentaDomain {

    @EmbeddedId
    private VentaId id;

    @Column(name="importe_referencial")
    private BigDecimal importeReferencial;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_cliente")
    private ClienteDomain cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_mesa")
    private MesaDomain mesa;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_dia")
    private DiaDomain dia;

}

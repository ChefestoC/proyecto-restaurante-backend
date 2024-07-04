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
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_PRODUCTO_INSUMO)
public class ProductoInsumoDomain {

    @EmbeddedId
    private ProductoInsumoId id;

    @Column(name="cantidad")
    private short cantidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_insumo")
    private InsumoDomain insumo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private ProductoDomain producto;
}

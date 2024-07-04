package com.chornapi.proyecto.restauranteback.domains;

import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_INSUMO)
public class InsumoDomain {

    @Id
    @Column(name="id_insumo")
    private short codInsumo;

    @Column(name="precio_compra")
    private BigDecimal precio;

    @Column(name="insumo")
    private String insumo;

    @Column(name="unidad")
    private String unidad;
}

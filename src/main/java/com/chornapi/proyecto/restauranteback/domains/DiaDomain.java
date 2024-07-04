package com.chornapi.proyecto.restauranteback.domains;

import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_DIA)
public class DiaDomain {

    @Id
    @Column(name="id_dia")
    @Temporal(TemporalType.DATE)
    private Date dia;

    @Column(name="fecha_apertura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaApertura;

    @Column(name="fecha_cierra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCierre;

    @Column(name="ingresos_calculados")
    private BigDecimal ingresosCalculados;

    @Column(name="costos_estimados")
    private BigDecimal costosEstimados;

    @Column(name="observaciones")
    private String observaciones;

    @Column(name="ingresos_reales")
    private BigDecimal ingresosReales;


}

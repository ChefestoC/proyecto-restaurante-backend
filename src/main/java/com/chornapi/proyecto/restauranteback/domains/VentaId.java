package com.chornapi.proyecto.restauranteback.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VentaId implements Serializable {

    @Column(name = "id_dia", insertable=false, updatable=false)
    @Temporal(TemporalType.DATE)
    private Date dia;

    @Column(name = "id_mesa", insertable=false, updatable=false)
    private short mesa;

    @Column(name = "fec_atencion", insertable=false, updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAtencion;

}

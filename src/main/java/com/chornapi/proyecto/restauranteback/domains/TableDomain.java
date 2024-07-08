package com.chornapi.proyecto.restauranteback.domains;

import com.chornapi.proyecto.restauranteback.utils.Constants;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_MESA)
public class TableDomain implements Serializable {

    @Serial
    private static final long serialVersionUID = -323212412123012391L;

    @Id
    @Column(name="id_mesa")
    private short id;

    @Column(name="estado")
    private boolean status;

    @Column(name="fec_registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

}

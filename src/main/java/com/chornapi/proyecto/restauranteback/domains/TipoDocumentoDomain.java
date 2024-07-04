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

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(schema = Constants.BBDD_ESQUEMA, name= Constants.BBDD_TABLA_TIPO_DOCUMENTO)
public class TipoDocumentoDomain {
    @Id
    @Column(name="id_tipo_documento")
    private short codTipoDocumento;

    @Column(name="tipo_documento")
    private String tipoDocumento;

}

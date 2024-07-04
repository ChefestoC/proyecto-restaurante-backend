package com.chornapi.proyecto.restauranteback.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MesaDto {

    int id;

    boolean estado;

    Date fechaRegistro;
}

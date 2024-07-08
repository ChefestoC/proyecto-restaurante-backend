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
public class TableDto {

    int id;

    boolean status;

    Date registerDate;
}

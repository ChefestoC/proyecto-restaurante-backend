package com.chornapi.proyecto.restauranteback.services;

import com.chornapi.proyecto.restauranteback.domains.MesaDomain;
import com.chornapi.proyecto.restauranteback.dto.MesaDto;

import java.util.List;

public interface MesaService {

    List<MesaDto> getMesas();
}

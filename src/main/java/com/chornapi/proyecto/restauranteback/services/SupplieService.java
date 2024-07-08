package com.chornapi.proyecto.restauranteback.services;

import com.chornapi.proyecto.restauranteback.dto.SupplieDto;
import com.chornapi.proyecto.restauranteback.dto.request.NewSupplieRequest;

import java.util.List;

public interface SupplieService {

    SupplieDto newSupplie(NewSupplieRequest request);


    List<SupplieDto> getAll();
}

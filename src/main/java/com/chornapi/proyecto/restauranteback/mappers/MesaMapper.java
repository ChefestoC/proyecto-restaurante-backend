package com.chornapi.proyecto.restauranteback.mappers;


import com.chornapi.proyecto.restauranteback.domains.MesaDomain;
import com.chornapi.proyecto.restauranteback.dto.MesaDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MesaMapper {

    List<MesaDto> mesaDomainListToMesaDtoList(List<MesaDomain> mesaDomainList);

    MesaDto mesaDomainToMesaDto(MesaDomain mesaDomain);

}

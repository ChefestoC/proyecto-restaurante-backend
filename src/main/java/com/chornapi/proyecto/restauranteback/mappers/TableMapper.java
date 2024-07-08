package com.chornapi.proyecto.restauranteback.mappers;


import com.chornapi.proyecto.restauranteback.domains.TableDomain;
import com.chornapi.proyecto.restauranteback.dto.TableDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TableMapper {

    List<TableDto> mesaDomainListToMesaDtoList(List<TableDomain> mesaDomainList);

    TableDto mesaDomainToMesaDto(TableDomain mesaDomain);

}

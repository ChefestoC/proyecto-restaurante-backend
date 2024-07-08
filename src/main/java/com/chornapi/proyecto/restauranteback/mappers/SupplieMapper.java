package com.chornapi.proyecto.restauranteback.mappers;

import com.chornapi.proyecto.restauranteback.domains.SupplieDomain;
import com.chornapi.proyecto.restauranteback.dto.SupplieDto;
import com.chornapi.proyecto.restauranteback.dto.request.NewSupplieRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SupplieMapper {


    SupplieDto supplieDomainToSupplieDto(SupplieDomain supplieDomain);

    SupplieDomain newSupplieRequestToSupplieDomain(NewSupplieRequest newSupplieRequest);


    List<SupplieDto> supplieDomainListToSupplieDtoList(List<SupplieDomain> supplieDomains);

}

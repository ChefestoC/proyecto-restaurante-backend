package com.chornapi.proyecto.restauranteback.services.impl;

import com.chornapi.proyecto.restauranteback.domains.SupplieDomain;
import com.chornapi.proyecto.restauranteback.dto.SupplieDto;
import com.chornapi.proyecto.restauranteback.dto.request.NewSupplieRequest;
import com.chornapi.proyecto.restauranteback.mappers.SupplieMapper;
import com.chornapi.proyecto.restauranteback.repository.SupplieRepository;
import com.chornapi.proyecto.restauranteback.services.SupplieService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@AllArgsConstructor
@Service
public class SupplieServiceImpl implements SupplieService {

    private final SupplieRepository supplieRepository;

    private final SupplieMapper supplieMapper;
    @Override
    public SupplieDto newSupplie(NewSupplieRequest request) {
        SupplieDomain newSupplie =  supplieMapper.newSupplieRequestToSupplieDomain(request);

        SupplieDomain supplieSaved = supplieRepository.save(newSupplie);

        return supplieMapper.supplieDomainToSupplieDto(supplieSaved);
    }


    @Override
    public List<SupplieDto> getAll(){
        return supplieMapper.supplieDomainListToSupplieDtoList(supplieRepository.findAll());
    }
}

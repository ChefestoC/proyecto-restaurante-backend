package com.chornapi.proyecto.restauranteback.services.impl;

import com.chornapi.proyecto.restauranteback.domains.MesaDomain;
import com.chornapi.proyecto.restauranteback.dto.MesaDto;
import com.chornapi.proyecto.restauranteback.mappers.MesaMapper;
import com.chornapi.proyecto.restauranteback.repository.MesaRepository;
import com.chornapi.proyecto.restauranteback.services.MesaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@AllArgsConstructor
@Service
public class MesaSerciceImpl implements MesaService {

    private final MesaRepository mesaRepository;

    private final MesaMapper mesaMapper;

    @Override
    public List<MesaDto> getMesas() {

        List<MesaDomain> mesasAll = mesaRepository.findAll();

        return mesaMapper.mesaDomainListToMesaDtoList(mesasAll);

        //return Collections.EMPTY_LIST;

    }
}

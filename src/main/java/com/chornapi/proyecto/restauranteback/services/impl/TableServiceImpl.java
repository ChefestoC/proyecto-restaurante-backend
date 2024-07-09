package com.chornapi.proyecto.restauranteback.services.impl;

import com.chornapi.proyecto.restauranteback.domains.TableDomain;
import com.chornapi.proyecto.restauranteback.dto.TableDto;
import com.chornapi.proyecto.restauranteback.mappers.TableMapper;
import com.chornapi.proyecto.restauranteback.repository.TableRepository;
import com.chornapi.proyecto.restauranteback.services.TableService;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.*;


@Log4j2
@AllArgsConstructor
@Service
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    private final TableMapper tableMapper;

    @Override
    public List<TableDto> getTablesActives() {

        List<TableDomain> mesasAll = tableRepository.findByStatusIs(true);

        return tableMapper.mesaDomainListToMesaDtoList(mesasAll);

    }


    @Override
    public void updateStatussToTable(String id, boolean status){

        Optional<TableDomain> optional = tableRepository.findById(Short.parseShort(id));

        if(optional.isEmpty()){
            log.error("Mesa no encontrada.");
            return;
        }
        TableDomain table = optional.get();
        table.setStatus(status);
        tableRepository.save(table);
    }

    @Override
    public TableDto newTable(){
        List<TableDomain> allTables = tableRepository.findAll();

        short idMax=allTables.stream()
                .max(Comparator.comparing(TableDomain::getId)).get().getId();

        idMax = (short) (idMax + 1);
        TableDomain tableSaved = tableRepository.save(TableDomain
                .builder()
                    .id(idMax)
                    .status(true)
                    .registerDate(new Date())
                .build());

        return tableMapper.mesaDomainToMesaDto(tableSaved);
    }
}

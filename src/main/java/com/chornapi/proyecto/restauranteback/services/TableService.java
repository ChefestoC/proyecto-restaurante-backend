package com.chornapi.proyecto.restauranteback.services;

import com.chornapi.proyecto.restauranteback.dto.TableDto;

import java.util.List;

public interface TableService {

    TableDto newTable();

    List<TableDto> getAllTables();

    List<TableDto> getTablesActives();

    void updateStatussToTable(String id, boolean status);

    void deleteTable(String id);


}

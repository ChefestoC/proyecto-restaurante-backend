package com.chornapi.proyecto.restauranteback.controller;

import com.chornapi.proyecto.restauranteback.dto.TableDto;
import com.chornapi.proyecto.restauranteback.dto.request.NewSupplieRequest;
import com.chornapi.proyecto.restauranteback.services.TableService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin({"*"})
@RequestMapping("/table")
@Log4j2
public class TableController {

    @Autowired
    TableService tableService;

    @PostMapping(value = "/new")
    public ResponseEntity<TableDto> newTable(@RequestBody NewSupplieRequest newSupplieRequest){
        return new ResponseEntity<>(tableService.newTable(), HttpStatus.CREATED);
    }

    @GetMapping(value = "/actives")
    public ResponseEntity<List<TableDto>> getTablesActive(){
        return new ResponseEntity<>(tableService.getTablesActives(), HttpStatus.OK);
    }

    @PatchMapping(value = "/status/{id}")
    public ResponseEntity<Void> patchStatusMe(@PathVariable String id,@RequestParam Boolean status){
        tableService.updateStatussToTable(id,status);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.chornapi.proyecto.restauranteback.controller;

import com.chornapi.proyecto.restauranteback.domains.MesaDomain;
import com.chornapi.proyecto.restauranteback.dto.MesaDto;
import com.chornapi.proyecto.restauranteback.services.MesaService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin({"*"})
@RequestMapping("/Mesa")
@Log4j2
public class MesaController {

    @Autowired
    MesaService mesaService;

    @GetMapping(value = "/All")
    public ResponseEntity<List<MesaDto>> getMesas(){
        return new ResponseEntity<>(mesaService.getMesas(), HttpStatus.OK);
    }
}

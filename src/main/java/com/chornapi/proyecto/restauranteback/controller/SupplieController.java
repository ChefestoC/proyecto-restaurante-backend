package com.chornapi.proyecto.restauranteback.controller;

import com.chornapi.proyecto.restauranteback.dto.SupplieDto;
import com.chornapi.proyecto.restauranteback.dto.request.NewSupplieRequest;
import com.chornapi.proyecto.restauranteback.services.SupplieService;
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
@RequestMapping("/supplies")
@Log4j2
public class SupplieController {

    @Autowired
    SupplieService supplieService;

    @PostMapping(value = "/new")
    public ResponseEntity<SupplieDto> newSupplie(NewSupplieRequest request){
        return new ResponseEntity<>(supplieService.newSupplie(request), HttpStatus.CREATED);
    }


    @GetMapping(value = "/all")
    public ResponseEntity<List<SupplieDto>> getAll(){
        return new ResponseEntity<>(supplieService.getAll(),HttpStatus.OK);
    }

}

package com.chornapi.proyecto.restauranteback.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class SupplieDto {

    public short supplieCode;
    public String supplie;
    public float price;

    public String unid;
}

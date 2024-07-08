package com.chornapi.proyecto.restauranteback.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewSupplieRequest {

    @NotBlank(message = "El Nombre del Insumo es necesario.")
    @JsonProperty("supplie")
    public String supplie;

    @NotNull(message = "El precio es necesario.")
    @JsonProperty("price")
    public float price;

    @NotBlank(message = "La Unidad del Insumo es necesario")
    @JsonProperty("unid")
    public String unid;

}

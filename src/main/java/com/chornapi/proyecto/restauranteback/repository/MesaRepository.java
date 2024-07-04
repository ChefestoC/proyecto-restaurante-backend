package com.chornapi.proyecto.restauranteback.repository;

import com.chornapi.proyecto.restauranteback.domains.MesaDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MesaRepository extends JpaRepository<MesaDomain,Short> {

}

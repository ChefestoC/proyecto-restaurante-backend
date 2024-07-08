package com.chornapi.proyecto.restauranteback.repository;

import com.chornapi.proyecto.restauranteback.domains.SupplieDomain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplieRepository extends JpaRepository<SupplieDomain,Short> {

}

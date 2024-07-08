package com.chornapi.proyecto.restauranteback.repository;

import com.chornapi.proyecto.restauranteback.domains.TableDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TableRepository extends JpaRepository<TableDomain,Short> {

    List<TableDomain> findByStatusIs(boolean status);


}

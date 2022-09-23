package com.paramonga.ssff.repositories;

import com.paramonga.ssff.entities.Estadistica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstadisticaRepository extends JpaRepository<Estadistica,String> {


}

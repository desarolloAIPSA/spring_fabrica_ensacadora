package com.paramonga.ssff.repositories;

import com.paramonga.ssff.entities.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EstacionRepository extends JpaRepository<Estacion, String> {
    @Query(value = "select * from meteorol_estacion t",nativeQuery = true)
    List<Estacion> getAll();
}

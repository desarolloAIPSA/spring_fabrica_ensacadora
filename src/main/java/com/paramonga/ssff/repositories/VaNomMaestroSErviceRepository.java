package com.paramonga.ssff.repositories;


import com.paramonga.ssff.entities.VaNomMaestro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VaNomMaestroSErviceRepository extends JpaRepository<VaNomMaestro,String> {

    @Query(value = "select distinct(t.presentacion) from fab_ensacadora_rango_histograma t",nativeQuery = true)
    List<VaNomMaestro> obtenerTodos();
}

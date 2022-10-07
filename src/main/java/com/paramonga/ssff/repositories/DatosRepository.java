package com.paramonga.ssff.repositories;

import com.paramonga.ssff.entities.Datos;
//import com.paramonga.ssff.entities.DatosId;
import com.paramonga.ssff.entities.DatosId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatosRepository extends JpaRepository<Datos, DatosId> {
    @Query(value = "select * from metereol_lect_diaria t where t.meteorol_estacion = :#{#estacion} and to_char(t.fecha,'yyyymmdd') >=  :#{#fecini} and to_char(t.fecha,'yyyymmdd') <=  :#{#fecfin} order by t.fecha DESC",nativeQuery = true)
    List<Datos> getByDateRange(String estacion, String fecini, String fecfin);
}

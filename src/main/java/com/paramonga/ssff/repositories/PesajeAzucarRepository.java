package com.paramonga.ssff.repositories;

import com.paramonga.ssff.entities.PesajeAzucar;
import com.paramonga.ssff.entities.PesajeAzucarId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PesajeAzucarRepository extends JpaRepository<PesajeAzucar, PesajeAzucarId> {

    @Query(value = "select * from pesaje_azucar t where trim(t.cod_templa)=:#{#id.codTempla} and t.num_balanza=:#{#id.numBalanza} and t.nro_conteo=:#{#id.nroConteo} and to_char(t.fecha_pesaje, 'mm/dd/yyyy hh24:mi:ss') = to_char(TO_DATE(:#{#id.fechaPesaje.toString()},'YYYY-MM-DD\"T\"hh24:mi:ss'),'mm/dd/yyyy hh24:mi:ss')",nativeQuery = true)
    PesajeAzucar obtenerSegunId(PesajeAzucarId id);

    @Query(value = "select * from pesaje_azucar t where to_char(t.fecha_pesaje,'yyyymmdd') >=  :#{#fechaIni} and to_char(t.fecha_pesaje,'yyyymmdd') <=  :#{#fechaFin} order by t.fecha_pesaje DESC",nativeQuery = true)
    Page<PesajeAzucar> obtenerTodosOrdenados(String fechaIni, String fechaFin, Pageable pageable);

    @Query(value = "select * from pesaje_azucar t order by t.fecha_pesaje DESC",nativeQuery = true)
    Page<PesajeAzucar> obtenerTodo(Pageable pageable);
}


package com.paramonga.ssff.services;

import com.paramonga.ssff.entities.Datos;

import java.util.List;

public interface DatosService {
    List<Datos> filtroByDateRange(String fecini, String fecfin, String estacion);
}

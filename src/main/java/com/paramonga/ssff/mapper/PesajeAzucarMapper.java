package com.paramonga.ssff.mapper;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter

public class PesajeAzucarMapper {

    private LocalDateTime fechaPesaje;
    private String codTempla;
    private Integer numBalanza;
    private Integer nroConteo;
    private String descripcion;
    private Double pesoNominal;
    private Double pesoReal;
    private Double pesoTolSup;
    private Double pesoTolInf;
    private String codUsr;
    private String estacion;
    private LocalDate fecRegistro;
    private String ruta;
    private String nivel;
    private LocalDateTime fecSistema;
    private String flagCheck;

}

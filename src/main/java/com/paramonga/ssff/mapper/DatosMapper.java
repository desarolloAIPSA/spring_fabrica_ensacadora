package com.paramonga.ssff.mapper;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class DatosMapper {
    private Date fecha;
    private String meteorolEstacion;
    private Float tempOut;
    private Float hiTemp;
    private Float lowTemp;
    private Float outHum;
    private Float dewPt;
    private Float windSpeed;
    private String windDir;
    private Float windRun;
    private Float hiSpeed;
    private String hiDir;
    private Float windChill;
    private Float heatIndex;
    private Float thxIndex;
    private Float thswIndex;
    private Float bar;
    private Float rain;
    private Float rainRate;
    private Float solarRad;
    private Float solarEnergy;
    private Float hiRad;
    private Float solarUvIndex;
    private Float uvDose;
    private Float hiUv;
    private Float heatDd;
    private Float coolDd;
    private Float inTemp;
    private Float inHum;
    private Float inDew;
    private Float inHeat;
    private Float inEmc;
    private Float inAirDensity;
    private Float et;
    private Integer windSamp;
    private Integer windTx;
    private Float issRecept;
    private Integer arcInt;
    private String dia;
    private String hora;
    private String codUsr;
    private Date fechaRegistro;
    private String estacion;
}

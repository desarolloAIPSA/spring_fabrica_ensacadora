package com.paramonga.ssff.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "metereol_lect_diaria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Datos {
    @EmbeddedId
    private DatosId id;
    //@Id
    //@Column(name = "meteorol_estacion", nullable = false)
    //private String meteorolEstacion;

    //@Column(name = "fecha", nullable = false)
    //private Date fecha;

    @Column(name = "temp_out")
    private Float tempOut;

    @Column(name = "hi_temp")
    private Float hiTemp;

    @Column(name = "low_temp")
    private Float lowTemp;

    @Column(name = "out_hum")
    private Float outHum;

    @Column(name = "dew_pt")
    private Float dewPt;

    @Column(name = "wind_speed")
    private Float windSpeed;

    @Column(name = "wind_dir")
    private String windDir;

    @Column(name = "wind_run")
    private Float windRun;

    @Column(name = "hi_speed")
    private Float hiSpeed;

    @Column(name = "hi_dir")
    private String hiDir;

    @Column(name = "wind_chill")
    private Float windChill;

    @Column(name = "heat_index")
    private Float heatIndex;

    @Column(name = "thw_index")
    private Float thxIndex;

    @Column(name = "thsw_index")
    private Float thswIndex;

    @Column(name = "bar")
    private Float bar;

    @Column(name = "rain")
    private Float rain;
    //+
    @Column(name = "rain_rate")
    private Float rainRate;

    @Column(name = "solar_rad")
    private Float solarRad;

    @Column(name = "solar_energy")
    private Float solarEnergy;

    @Column(name = "hi_rad")
    private Float hiRad;

    @Column(name = "solar_uv_index")
    private Float solarUvIndex;

    @Column(name = "uv_dose")
    private Float uvDose;

    @Column(name = "hi_uv")
    private Float hiUv;

    @Column(name = "heat_dd")
    private Float heatDd;

    @Column(name = "cool_dd")
    private Float coolDd;

    @Column(name = "in_temp")
    private Float inTemp;

    @Column(name = "in_hum")
    private Float inHum;

    @Column(name = "in_dew")
    private Float inDew;

    @Column(name = "in_heat")
    private Float inHeat;

    @Column(name = "in_emc")
    private Float inEmc;

    @Column(name = "in_air_density")
    private Float inAirDensity;

    @Column(name = "et")
    private Float et;

    @Column(name = "wind_samp")
    private Integer windSamp;

    @Column(name = "wind_tx")
    private Integer windTx;
    //+
    @Column(name = "iss_recept")
    private Float issRecept;

    @Column(name = "arc_int")
    private Integer arcInt;

    @Column(name = "dia")
    private String dia;

    @Column(name = "hora")
    private String hora;

    @Column(name = "cod_usr")
    private String codUsr;

    @Column(name = "fecha_registro")
    private Date fechaRegistro;

    @Column(name = "estacion")
    private String estacion;
}

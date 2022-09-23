package com.paramonga.ssff.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tt_fab_ensacadora_rango_histograma")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Estadistica {

    @Id
    @Column(name = "RANGO_MIN")
    private Double rangoMin;

    @Column(name = "RANGO_MAX")
    private Double rangoMax;

    @Column(name = "FREC_ABSOLUTA")
    private Integer frecAbsoluta;

    @Column(name = "VN_SUMA")
    private Double vnSuma;

    @Column(name = "VN_PROM")
    private Double vnProm;

    @Column(name = "VR_SUMA")
    private Double vrSuma;

    @Column(name = "VR_PROM")
    private Double vrProm;

    @Column(name = "VR_SD")
    private Double vrSd;

    @Column(name = "VR_VARI")
    private Double vrVari;

    @Column(name = "CHECK_SI")
    private Integer checkSi;

    @Column(name = "CHECK_NO")
    private Integer checkNo;

    @Column(name = "PESO_BAJO")
    private Integer pesoBajo;

    @Column(name = "PESO_MEDIO")
    private Integer pesoMedio;

    @Column(name = "PESO_ALTO")
    private Integer pesoAlto;

    @Column(name = "TOTAL")
    private Integer total;






}


package com.paramonga.ssff.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.List;

@Getter
@Setter
public class EstadisticaModel {
    public List<HistogramaModel> valores;
    private Double vnSuma;
    private Double vnProm;
    private Double vrSuma;
    private Double vrProm;
    private Double vrSd;
    private Double vrVari;
    private Integer checkSi;
    private Integer checkNo;
    private Integer pesoBajo;
    private Integer pesoMedio;
    private Integer pesoAlto;
    private Integer total;
}

package com.paramonga.ssff.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "pesaje_azucar")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PesajeAzucar {
    @EmbeddedId
    private PesajeAzucarId id;

    @Column(name = "descripcion", length = 60)
    private String descripcion;

    @Column(name = "peso_nominal")
    private Double pesoNominal;

    @Column(name = "peso_real")
    private Double pesoReal;

    @Column(name = "peso_tol_sup")
    private Double pesoTolSup;

    @Column(name = "peso_tol_inf")
    private Double pesoTolInf;

    @Column(name = "cod_usr", length = 6)
    private String codUsr;

    @Column(name = "estacion", length = 15)
    private String estacion;

    @Column(name = "fec_registro")
    private LocalDate fecRegistro;

    @Column(name = "ruta", length = 200)
    private String ruta;

    @Column(name = "NIVEL")
    private String nivel;

    @Column(name = "FEC_SISTEMA")
    private LocalDateTime fecSistema;

    @Column(name = "FLAG_CHECK")
    private String flagCheck;

}
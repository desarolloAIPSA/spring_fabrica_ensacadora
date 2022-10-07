package com.paramonga.ssff.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meteorol_estacion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Estacion {
    @Id
    @Column(name = "meteorol_estacion")
    private String meteorolEstacion;

    @Column(name = "descripcion")
    private String descripcion;

}

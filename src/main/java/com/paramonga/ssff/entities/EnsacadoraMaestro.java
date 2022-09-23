package com.paramonga.ssff.entities;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fab_maestro_ensacadora")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EnsacadoraMaestro {
    @Id
    @Column(name = "item")
    private Integer item;

    @Column(name = "nro_balanza")
    private String nroBalanza;

    @Column(name = "descripcion")
    private String descripcion;
}

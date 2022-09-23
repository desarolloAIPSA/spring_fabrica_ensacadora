package com.paramonga.ssff.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fab_ensacadora_rango_histograma")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class VaNomMaestro {

    @Id
    @Column(name = "presentacion")
    private Double presentacion;

}

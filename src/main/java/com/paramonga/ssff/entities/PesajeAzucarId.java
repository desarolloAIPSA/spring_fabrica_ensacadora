package com.paramonga.ssff.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PesajeAzucarId implements Serializable {

    @Column(name = "fecha_pesaje", nullable = false)
    private LocalDateTime fechaPesaje;

    @Column(name = "cod_templa", nullable = false, length = 10)
    private String codTempla;

    @Column(name = "num_balanza", nullable = false)
    private Integer numBalanza;

    @Column(name = "nro_conteo", nullable = false)
    private Integer nroConteo;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PesajeAzucarId entity = (PesajeAzucarId) o;
        return Objects.equals(this.nroConteo, entity.nroConteo) &&
                Objects.equals(this.codTempla, entity.codTempla) &&
                Objects.equals(this.fechaPesaje, entity.fechaPesaje) &&
                Objects.equals(this.numBalanza, entity.numBalanza);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroConteo, codTempla, fechaPesaje, numBalanza);
    }

}
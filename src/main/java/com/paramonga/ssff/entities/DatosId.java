package com.paramonga.ssff.entities;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DatosId implements Serializable {
    @Column(name = "meteorol_estacion", nullable = false)
    private String meteorolEstacion;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DatosId entity = (DatosId) o;
        return Objects.equals(this.meteorolEstacion, entity.meteorolEstacion) &&
                Objects.equals(this.fecha, entity.fecha) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meteorolEstacion, fecha);
    }
}

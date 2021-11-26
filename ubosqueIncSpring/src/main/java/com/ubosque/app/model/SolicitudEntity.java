package com.ubosque.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "solicitud", schema = "procesadatos", catalog = "")
public class SolicitudEntity {
    private int idSolicitud;
    private String nombreSolicitud;
    private short activo;

    @Id
    @Column(name = "idSolicitud")
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Basic
    @Column(name = "nombreSolicitud")
    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    @Basic
    @Column(name = "activo")
    public short getActivo() {
        return activo;
    }

    public void setActivo(short activo) {
        this.activo = activo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolicitudEntity that = (SolicitudEntity) o;
        return idSolicitud == that.idSolicitud && activo == that.activo && Objects.equals(nombreSolicitud, that.nombreSolicitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSolicitud, nombreSolicitud, activo);
    }
}

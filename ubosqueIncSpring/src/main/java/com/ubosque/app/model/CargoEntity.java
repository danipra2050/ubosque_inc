package com.ubosque.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cargo", schema = "procesadatos", catalog = "")
public class CargoEntity {
    private int idCargo;
    private String nombreCargo;
    private short activo;

    @Id
    @Column(name = "idCargo")
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    @Basic
    @Column(name = "nombreCargo")
    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
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
        CargoEntity that = (CargoEntity) o;
        return idCargo == that.idCargo && activo == that.activo && Objects.equals(nombreCargo, that.nombreCargo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCargo, nombreCargo, activo);
    }
}

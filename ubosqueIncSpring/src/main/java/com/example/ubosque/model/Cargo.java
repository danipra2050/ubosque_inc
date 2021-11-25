package com.example.ubosque.model;

import javax.persistence.*;

@Table(name = "cargo")
@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCargo", nullable = false)
    private Integer id;

    @Column(name = "nombreCargo", nullable = false, length = 50)
    private String nombreCargo;

    @Column(name = "activo", nullable = false)
    private Integer activo;

    public Integer getActivo() {
        return activo;
    }

    public void setActivo(Integer activo) {
        this.activo = activo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
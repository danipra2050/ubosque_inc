package com.ubosque.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "empleado", schema = "procesadatos", catalog = "")
public class EmpleadoEntity {
    private long documentoEmpleado;
    private String nombreEmpleado;
    private long salario;
    private Date fechaIngreso;

    @Id
    @Column(name = "documentoEmpleado")
    public long getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(long documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    @Basic
    @Column(name = "nombreEmpleado")
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    @Basic
    @Column(name = "salario")
    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }

    @Basic
    @Column(name = "fechaIngreso")
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpleadoEntity that = (EmpleadoEntity) o;
        return documentoEmpleado == that.documentoEmpleado && salario == that.salario && Objects.equals(nombreEmpleado, that.nombreEmpleado) && Objects.equals(fechaIngreso, that.fechaIngreso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentoEmpleado, nombreEmpleado, salario, fechaIngreso);
    }
}

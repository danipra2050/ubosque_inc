package com.ubosque.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "pila", schema = "procesadatos", catalog = "")
public class PilaEntity {
    private int idPila;
    private int anio;
    private int mes;
    private long ibc;
    private long saludPagar;
    private long saludPagada;
    private int saludTarifa;
    private long pensionPagar;
    private long pensionPagada;
    private int pensionTarifa;

    @Id
    @Column(name = "idPila")
    public int getIdPila() {
        return idPila;
    }

    public void setIdPila(int idPila) {
        this.idPila = idPila;
    }

    @Basic
    @Column(name = "anio")
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Basic
    @Column(name = "mes")
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Basic
    @Column(name = "ibc")
    public long getIbc() {
        return ibc;
    }

    public void setIbc(long ibc) {
        this.ibc = ibc;
    }

    @Basic
    @Column(name = "saludPagar")
    public long getSaludPagar() {
        return saludPagar;
    }

    public void setSaludPagar(long saludPagar) {
        this.saludPagar = saludPagar;
    }

    @Basic
    @Column(name = "saludPagada")
    public long getSaludPagada() {
        return saludPagada;
    }

    public void setSaludPagada(long saludPagada) {
        this.saludPagada = saludPagada;
    }

    @Basic
    @Column(name = "saludTarifa")
    public int getSaludTarifa() {
        return saludTarifa;
    }

    public void setSaludTarifa(int saludTarifa) {
        this.saludTarifa = saludTarifa;
    }

    @Basic
    @Column(name = "pensionPagar")
    public long getPensionPagar() {
        return pensionPagar;
    }

    public void setPensionPagar(long pensionPagar) {
        this.pensionPagar = pensionPagar;
    }

    @Basic
    @Column(name = "pensionPagada")
    public long getPensionPagada() {
        return pensionPagada;
    }

    public void setPensionPagada(long pensionPagada) {
        this.pensionPagada = pensionPagada;
    }

    @Basic
    @Column(name = "pensionTarifa")
    public int getPensionTarifa() {
        return pensionTarifa;
    }

    public void setPensionTarifa(int pensionTarifa) {
        this.pensionTarifa = pensionTarifa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PilaEntity that = (PilaEntity) o;
        return idPila == that.idPila && anio == that.anio && mes == that.mes && ibc == that.ibc && saludPagar == that.saludPagar && saludPagada == that.saludPagada && saludTarifa == that.saludTarifa && pensionPagar == that.pensionPagar && pensionPagada == that.pensionPagada && pensionTarifa == that.pensionTarifa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPila, anio, mes, ibc, saludPagar, saludPagada, saludTarifa, pensionPagar, pensionPagada, pensionTarifa);
    }
}

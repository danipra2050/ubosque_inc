package com.ubosque.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nomina", schema = "procesadatos", catalog = "")
public class NominaEntity {
    private int idNomina;
    private long documento;
    private Long ibc;
    private Long ingresoTotal;
    private Long salud;
    private Long pension;
    private Long arl;

    @Id
    @Column(name = "idNomina")
    public int getIdNomina() {
        return idNomina;
    }

    public void setIdNomina(int idNomina) {
        this.idNomina = idNomina;
    }

    @Basic
    @Column(name = "documento")
    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    @Basic
    @Column(name = "ibc")
    public Long getIbc() {
        return ibc;
    }

    public void setIbc(Long ibc) {
        this.ibc = ibc;
    }

    @Basic
    @Column(name = "ingresoTotal")
    public Long getIngresoTotal() {
        return ingresoTotal;
    }

    public void setIngresoTotal(Long ingresoTotal) {
        this.ingresoTotal = ingresoTotal;
    }

    @Basic
    @Column(name = "salud")
    public Long getSalud() {
        return salud;
    }

    public void setSalud(Long salud) {
        this.salud = salud;
    }

    @Basic
    @Column(name = "pension")
    public Long getPension() {
        return pension;
    }

    public void setPension(Long pension) {
        this.pension = pension;
    }

    @Basic
    @Column(name = "arl")
    public Long getArl() {
        return arl;
    }

    public void setArl(Long arl) {
        this.arl = arl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NominaEntity that = (NominaEntity) o;
        return idNomina == that.idNomina && documento == that.documento && Objects.equals(ibc, that.ibc) && Objects.equals(ingresoTotal, that.ingresoTotal) && Objects.equals(salud, that.salud) && Objects.equals(pension, that.pension) && Objects.equals(arl, that.arl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNomina, documento, ibc, ingresoTotal, salud, pension, arl);
    }
}

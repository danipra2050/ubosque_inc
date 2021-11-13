package com.ubosque.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empresa", schema = "procesadatos", catalog = "")
public class EmpresaEntity {
    private long documentoEmpresa;
    private String razonSocial;
    private String direccionEmpresa;
    private short activo;

    @Id
    @Column(name = "documentoEmpresa")
    public long getDocumentoEmpresa() {
        return documentoEmpresa;
    }

    public void setDocumentoEmpresa(long documentoEmpresa) {
        this.documentoEmpresa = documentoEmpresa;
    }

    @Basic
    @Column(name = "razonSocial")
    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    @Basic
    @Column(name = "direccionEmpresa")
    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
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
        EmpresaEntity that = (EmpresaEntity) o;
        return documentoEmpresa == that.documentoEmpresa && activo == that.activo && Objects.equals(razonSocial, that.razonSocial) && Objects.equals(direccionEmpresa, that.direccionEmpresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentoEmpresa, razonSocial, direccionEmpresa, activo);
    }
}

package com.ubosque.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tipoDocumento", schema = "procesadatos", catalog = "")
public class TipoDocumentoEntity {
    private int idTipoDoc;
    private String nombreTipoDoc;
    private short activo;

    @Id
    @Column(name = "idTipoDoc")
    public int getIdTipoDoc() {
        return idTipoDoc;
    }

    public void setIdTipoDoc(int idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    @Basic
    @Column(name = "nombreTipoDoc")
    public String getNombreTipoDoc() {
        return nombreTipoDoc;
    }

    public void setNombreTipoDoc(String nombreTipoDoc) {
        this.nombreTipoDoc = nombreTipoDoc;
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
        TipoDocumentoEntity that = (TipoDocumentoEntity) o;
        return idTipoDoc == that.idTipoDoc && activo == that.activo && Objects.equals(nombreTipoDoc, that.nombreTipoDoc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoDoc, nombreTipoDoc, activo);
    }
}

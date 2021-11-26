package com.ubosque.app.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "usuarioAcceso", schema = "procesadatos", catalog = "")
public class UsuarioAccesoEntity {

    private long identificacionUsuario;
    private String nombreUsuario;
    private String contrasenaUsuario;
    private short activo;
    private String token;

    @Id
    @Column(name = "identificacionUsuario")
    public long getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(long identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    @Basic
    @Column(name = "nombreUsuario")
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Basic
    @Column(name = "contrasenaUsuario")
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
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
        UsuarioAccesoEntity that = (UsuarioAccesoEntity) o;
        return identificacionUsuario == that.identificacionUsuario && activo == that.activo && Objects.equals(nombreUsuario, that.nombreUsuario) && Objects.equals(contrasenaUsuario, that.contrasenaUsuario);
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacionUsuario, nombreUsuario, contrasenaUsuario, activo, token);
    }
}

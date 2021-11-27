package com.ubosque.app.model;

public class LoginRequest{

    private Long usuario;
    private String contrasena;

    public LoginRequest() {
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

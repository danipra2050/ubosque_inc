package com.ubosque.app.service;

import com.ubosque.app.model.UsuarioAccesoEntity;

import java.util.List;

public interface ILogin {

    public List<UsuarioAccesoEntity> listaTodos();

    public UsuarioAccesoEntity busquedaUsuario(Long usuario, String contrasena);
}

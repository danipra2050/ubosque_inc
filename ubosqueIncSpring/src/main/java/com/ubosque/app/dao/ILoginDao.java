package com.ubosque.app.dao;

import com.ubosque.app.model.UsuarioAccesoEntity;

import java.util.List;

public interface ILoginDao {

    public List<UsuarioAccesoEntity> listaTodos();

    public UsuarioAccesoEntity busquedaUsuario(Long usuario, String contrasena);
}

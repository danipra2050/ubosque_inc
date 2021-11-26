package com.ubosque.app.service;

import com.ubosque.app.dao.ILoginDao;
import com.ubosque.app.model.UsuarioAccesoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements ILogin{

    @Autowired
    private ILoginDao iLoginDao;

    @Override
    public List<UsuarioAccesoEntity> listaTodos() {
        return iLoginDao.listaTodos();
    }

    @Override
    public UsuarioAccesoEntity busquedaUsuario(Long user, String pass) {
        return iLoginDao.busquedaUsuario(user, pass);
    }
}

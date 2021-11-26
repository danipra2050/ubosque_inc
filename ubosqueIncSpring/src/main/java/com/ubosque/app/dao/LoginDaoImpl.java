package com.ubosque.app.dao;

import com.ubosque.app.model.UsuarioAccesoEntity;
import com.ubosque.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class LoginDaoImpl implements ILoginDao{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<UsuarioAccesoEntity> listaTodos() {
        List<UsuarioAccesoEntity> usuarioAccesoList = null;
        try(Session session = entityManager.unwrap(Session.class)){
            Query<UsuarioAccesoEntity> query = session.createQuery("from UsuarioAccesoEntity");
            usuarioAccesoList = query.getResultList();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return usuarioAccesoList;
    }

    @Override
    public UsuarioAccesoEntity busquedaUsuario(Long usuario, String contrasena) {
        UsuarioAccesoEntity usuarioAcceso = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            Query<UsuarioAccesoEntity> query = session
                    .createQuery("FROM UsuarioAccesoEntity u WHERE u.id = :usuario AND u.contrasenaUsuario = :contra AND activo = 1", UsuarioAccesoEntity.class)
                    .setParameter("usuario", usuario)
                    .setParameter("contra", contrasena);
            usuarioAcceso = query.uniqueResult();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return usuarioAcceso;
    }
}

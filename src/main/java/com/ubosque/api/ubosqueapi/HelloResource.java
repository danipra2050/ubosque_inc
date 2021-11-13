package com.ubosque.api.ubosqueapi;

import com.ubosque.model.CargoEntity;
import com.ubosque.util.HibernateUtil;
import org.hibernate.Session;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/hello-world")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String hello() {
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            List<CargoEntity> cargoList = session.createQuery("from CargoEntity", CargoEntity.class).list();
            cargoList.forEach(c -> System.out.println(c.getNombreCargo()));
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return "Hello, World!";
    }
}
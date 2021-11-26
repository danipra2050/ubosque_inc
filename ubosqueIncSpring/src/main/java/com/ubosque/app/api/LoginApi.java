package com.ubosque.app.api;

import com.ubosque.app.model.UsuarioAccesoEntity;
import com.ubosque.app.service.ILogin;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class LoginApi{

    @Autowired
    private ILogin iLogin;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name + "...!!!";
    }

    @PostMapping("/login")
    public UsuarioAccesoEntity login(@RequestParam("usuario") Long usuario, @RequestParam("contrasena") String contrasena){
        UsuarioAccesoEntity usuarioAcceso = iLogin.busquedaUsuario(usuario, contrasena);
        if(usuarioAcceso != null){
            usuarioAcceso.setToken(getJWT(usuarioAcceso.getNombreUsuario(), usuarioAcceso.getContrasenaUsuario()));
        }
        return usuarioAcceso;
    }

    private String getJWT(String usuario, String contrasena){
        String privateKey = "estoEsALGOSeCreTo";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils.
                commaSeparatedStringToAuthorityList("ROLE_USER");

        String token = Jwts
                .builder()
                .setId("softtekJWT")
                .setSubject(usuario)
                .setSubject(contrasena)
                .claim("authorities", grantedAuthorities.stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 60000))
                .signWith(SignatureAlgorithm.HS256, privateKey.getBytes()).compact();

        return token;
    }
}

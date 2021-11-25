package com.example.ubosque.controller;

import com.example.ubosque.model.UsuarioAcceso;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LoginController {

    @RequestMapping("hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name + "...!!!";
    }

    @PostMapping("login")
    public UsuarioAcceso login(@RequestParam("usuario") String usuario, @RequestParam("contrasena") String contrasena){
        UsuarioAcceso usuarioAcceso = new UsuarioAcceso();
        usuarioAcceso.setNombreUsuario(usuario);
        usuarioAcceso.setContrasenaUsuario(contrasena);
        usuarioAcceso.setToken(getJWT(usuario, contrasena));
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

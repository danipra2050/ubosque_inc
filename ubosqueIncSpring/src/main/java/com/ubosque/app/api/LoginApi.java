package com.ubosque.app.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ubosque.app.model.LoginRequest;
import com.ubosque.app.model.Response;
import com.ubosque.app.model.UsuarioAccesoEntity;
import com.ubosque.app.service.ILogin;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api")
public class LoginApi{

    @Autowired
    private ILogin iLogin;

    private ObjectMapper objectMapper;

    @GetMapping("/hello")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name){
        return "Hello " + name + "...!!!";
    }

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public Response login(@RequestBody String stringRequest) throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        Response response = new Response();
        LoginRequest loginRequest = objectMapper.readValue(stringRequest, LoginRequest.class);

        UsuarioAccesoEntity usuarioAcceso = iLogin.busquedaUsuario(loginRequest.getUsuario(), loginRequest.getContrasena());
        if(usuarioAcceso != null){
            usuarioAcceso.setToken(getJWT(usuarioAcceso.getNombreUsuario(), usuarioAcceso.getContrasenaUsuario()));
            response.setCode("200");
            response.setMessage("Success");
            response.setData(usuarioAcceso);
        }else{
            response.setCode("400");
            response.setMessage("Data not found");
        }
        return response;
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

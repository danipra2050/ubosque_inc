package com.ubosque.app;

import com.ubosque.app.security.JWTAuthorizationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan()
public class UbosqueIncSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(UbosqueIncSpringApplication.class, args);
    }

    @EnableWebSecurity
    @Configuration
    class WebSecurityConfig extends WebSecurityConfigurerAdapter{

        @Override
        protected void configure(HttpSecurity http) throws Exception{
            http.csrf().disable()
                    .addFilterAfter(new JWTAuthorizationFilter(), UsernamePasswordAuthenticationFilter.class)
                    .authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/api/login").permitAll()
                    .anyRequest().authenticated();
        }
    }
}
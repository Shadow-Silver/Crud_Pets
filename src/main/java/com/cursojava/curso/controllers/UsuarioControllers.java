package com.cursojava.curso.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//sirve x se dividen las diferentes funciones, se van a colocar las diferentes acciones
@RestController
public class UsuarioControllers {

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba";
    }
}

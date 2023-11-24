package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//sirve x se dividen las diferentes funciones, se van a colocar las diferentes acciones
@RestController
public class UsuarioControllers {

    // METODOS X CADA UNA DE LAS FUNCIONES
    @RequestMapping(value = "usuario/{id}") //enruta lo que queremos ver en el nave  //SI QUEREMOS BUSCAR UN USUARIO EN ESPECIFICO ES USUARIO/#ID
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("234234249");
        return usuario;
    }
    @RequestMapping(value = "usuario999")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("234234249");
        return usuario;
    }
    @RequestMapping(value = "usuario09") //enruta lo que queremos ver en el nave
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("234234249");
        return usuario;
    }
    @RequestMapping(value = "usuario84") //enruta lo que queremos ver en el nave
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucasmoy@gmail.com");
        usuario.setTelefono("234234249");
        return usuario;
    }
}

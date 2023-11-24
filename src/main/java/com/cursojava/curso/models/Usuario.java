package com.cursojava.curso.models;

import jakarta.persistence.Column; // especifica el name de la columna en BD//importaciones de paquetes
import jakarta.persistence.Entity; //marca una clase como entidad de BD
import jakarta.persistence.Id; // entindad de llave primary
import jakarta.persistence.Table; //especifica el nombre de la table en BD
import lombok.Getter;
import lombok.Setter;


@Entity //entidad referencia a BD y se puede hacer operaciones, inser, actuli, o elimi filas
@Table (name = "usuarios") //relaciona a la tabla de users
public class Usuario {   //la clase + name, almacena info de cualquier user

    @Getter //obtiene valor, se obtiene de la dependencia lombok
    @Setter // asigna valores "       "
    @Column(name = "id") //para que columna ban los datos
    @Id
    private Long id; //atribu, solo es visible o acceder dentro de la clase


    @Setter
    @Getter
    @Column(name = "nombre")
    private String nombre;


    @Setter
    @Getter
    @Column(name = "apellido")
    private String apellido;


    @Setter
    @Getter
    @Column(name = "email")
    private String email;


    @Setter
    @Getter
    @Column(name = "telefono")
    private String telefono;


    @Setter
    @Getter
    @Column(name = "password")
    private String password;

}










   /* public Long getId() { //obtiene un valor
        return id;
    }

    public void setId(Long id) { //asignan valores
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}*/

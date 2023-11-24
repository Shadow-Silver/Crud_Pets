package com.cursojava.curso.dao;

import com.cursojava.curso.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional //como ejecutar las consultas de mysql
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager; //conexion con la base de datos
    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
       return entityManager.createQuery(query).getResultList();

    }
}

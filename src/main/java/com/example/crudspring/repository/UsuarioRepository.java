package com.example.crudspring.repository;

import com.example.crudspring.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
//Interfaz implementa ciertos metodos que ya estan implementados en CrudRepository que es la clase que implementa la
// mayoria de metodos para la DB, se especifica el tipo de dato = UsuarioModel y el id
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
}

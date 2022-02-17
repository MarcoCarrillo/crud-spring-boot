package com.example.crudspring.repository;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleUsuarioRepository extends JpaRepository<DetalleUsuarioModel, Long> {

}

package com.example.crudspring.services;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.repository.DetalleUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DetalleUsuarioService {

    @Autowired
    DetalleUsuarioRepository detalleUsuarioRepository;

    //Arraylist de detalles
    public ArrayList<DetalleUsuarioModel> obtenerDetalles(){
        return (ArrayList<DetalleUsuarioModel>) detalleUsuarioRepository.findAll();
    }

    public DetalleUsuarioModel guardarDetalleUsuario(Long id, DetalleUsuarioModel detalle){
        return detalleUsuarioRepository.save(detalle);
    }

    public Optional<DetalleUsuarioModel> obtenerPorId(Long id){
        return detalleUsuarioRepository.findById(id);
    }



}

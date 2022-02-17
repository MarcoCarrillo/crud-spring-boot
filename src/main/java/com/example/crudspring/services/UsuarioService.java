package com.example.crudspring.services;

import com.example.crudspring.models.UsuarioModel;
import com.example.crudspring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioService {
    //Autowired para que no tengamos que instanciar y se haga automaticamente
    @Autowired
    UsuarioRepository usuarioRepository;

    //Traer un arreglo de objetos del modelo de usuario
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        //Traer todos los registros y castear a un ArrayList de Usuario para regresarlo como JSON
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }

    public Optional<UsuarioModel> obtenerPorId(Long id){
        return usuarioRepository.findById(id);
    }

//    public ArrayList<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
//        return usuarioRepository.findByPrioridad(prioridad);
//    }

    public boolean eliminarUsuario(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err){
            return false;
        }
    }

//    public ArrayList<UsuarioModel> obtenerPorNombreYId(String nombre, Long id){
//        return usuarioRepository.findByNombreAndId(nombre, id);
//    }

}

package com.example.crudspring.services;

import com.example.crudspring.models.UsuarioModel;
import com.example.crudspring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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



}

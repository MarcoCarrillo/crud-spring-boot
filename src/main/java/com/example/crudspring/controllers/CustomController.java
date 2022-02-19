package com.example.crudspring.controllers;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.models.UsuarioModel;
import com.example.crudspring.services.DetalleUsuarioService;
import com.example.crudspring.services.UsuarioService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/allUsuarios")
public class CustomController {
    //Log4j
    private static Logger logger = Logger.getLogger(CustomController.class);

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    DetalleUsuarioService detalleUsuarioService;

    @GetMapping
    public ArrayList<Object> obtenerUsuarioYDetalles(){
        ArrayList<UsuarioModel> usuarios = usuarioService.obtenerUsuarios();
        ArrayList<DetalleUsuarioModel> detalles = detalleUsuarioService.obtenerDetalles();

        ArrayList<Object> usuariosDetalles = new ArrayList<>();
        usuariosDetalles.addAll(usuarios);
        usuariosDetalles.addAll(detalles);

        logger.info("Usuarios y detalles" + usuariosDetalles);

        return usuariosDetalles;
    }

}

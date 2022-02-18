package com.example.crudspring.controllers;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.services.DetalleUsuarioService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/detalles")
public class DetalleUsuarioController {
    //Log4j
    private static Logger logger = Logger.getLogger(DetalleUsuarioController.class);

    @Autowired
    DetalleUsuarioService detalleUsuarioService;

    @GetMapping
    public ArrayList<DetalleUsuarioModel> obtenerDetalleUsuarios(){
        ArrayList<DetalleUsuarioModel> detalleUsuarios = detalleUsuarioService.obtenerDetalles();
        for (int i = 0; i < detalleUsuarios.size(); i++) {
            logger.info("Detalles de usuarios: " + detalleUsuarios.get(i).getId());
        }

        return detalleUsuarios;
    }

    @PostMapping
    DetalleUsuarioModel guardarDetalleUsuarioPorId(@RequestBody Long id, DetalleUsuarioModel detalleUsuario){
        logger.info("Detalle de usuario con el id #"+ id +"insertado");
        return this.detalleUsuarioService.guardarDetalleUsuario(id, detalleUsuario);
    }
}

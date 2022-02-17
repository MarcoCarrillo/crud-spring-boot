package com.example.crudspring.controllers;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.models.UsuarioModel;
import com.example.crudspring.services.UsuarioService;
import org.apache.log4j.Logger;
import org.apache.tomcat.util.json.JSONParser;
import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    //Log4j
    private static Logger logger = Logger.getLogger(UsuarioController.class);

    //Instanciar el servicio automaticamente
    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        //Duda mostrar en array
        ArrayList<UsuarioModel> usuarios = usuarioService.obtenerUsuarios();
//        System.out.println(usuarios.size());
        for (int i = 0; i < usuarios.size() ; i++) {
            logger.info("Usuario: " + usuarios.get(i).getNombre());
        }

//        logger.info("Usuarios: " + usuarios);
        return usuarios;
    }

    @PostMapping
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        logger.info("Usuario insertado: " + usuario.getNombre() + "," + usuario.getEmail() + ", " + usuario.getPrioridad() );
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> obtenerPorId(@PathVariable("id") Long id){
        logger.info("Se obtuvo el usuario con Id #" + id);
        //Validar valores nulos
        return this.usuarioService.obtenerPorId(id);
    }

//    @GetMapping("/query")
//    public ArrayList<UsuarioModel> obtenerUserPorPrioridad(@RequestParam("prioridad") Integer prioridad){
//        logger.info("Se obtuvieron el/los usuarios por prioridad #" + prioridad);
//        return this.usuarioService.obtenerPorPrioridad(prioridad);
//
//    }

    @DeleteMapping(path = "/{id}")
    public String eliminarUserPorId(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if (ok){
            logger.warn("Se elimino el usuario con el Id #" + id);
            return "Se elimino el usuario con id #" + id;
        } else {
            logger.error("Ocurrio un error al eliminar al usuario con el id #" + id);
            return "No se pudo eliminar el usuario con id #" + id;
        }
    }

//    @GetMapping("/nombreId")
//    public ArrayList<UsuarioModel> obtenerUserPorNombreYId(@RequestParam("nombre") String nombre,
//                                                           @RequestParam("id") Long id) {
//        return this.usuarioService.obtenerPorNombreYId(nombre, id);
//
//    }
}

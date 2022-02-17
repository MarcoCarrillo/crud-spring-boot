package com.example.crudspring;

import com.example.crudspring.models.DetalleUsuarioModel;
import com.example.crudspring.models.UsuarioModel;
import com.example.crudspring.repository.DetalleUsuarioRepository;
import com.example.crudspring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudspringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudspringApplication.class, args);
	}

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private DetalleUsuarioRepository detalleUsuarioRepository;

	@Override
	public void run(String... args) throws Exception {

		//Objeto de usuario
//		UsuarioModel usuario = new UsuarioModel();
//		usuario.setNombre("Maria");
//		usuario.setEmail("maria@gmail.com");
//		usuario.setPrioridad(2);
//
//		DetalleUsuarioModel detalleUsuario = new DetalleUsuarioModel();
//		detalleUsuario.setIdioma("Chino");
//		detalleUsuario.setPais("China");
//		detalleUsuario.setActivo(true);
//
//		usuario.setDetalleUsuario(detalleUsuario);
//		detalleUsuario.setUsuarioModel(usuario);

//		usuarioRepository.save(usuario);
//		usuarioRepository.deleteById(3L);

	}
}

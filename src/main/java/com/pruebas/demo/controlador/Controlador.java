package com.pruebas.demo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.demo.modelos.Usuarios;
import com.pruebas.demo.repositorio.RepositorioUsuario;

@RestController
@RequestMapping("/user")
public class Controlador {

	@Autowired
	private RepositorioUsuario repositorioUsuario;
	
	@GetMapping
	public List<Usuarios> usuarios(){
		return (List<Usuarios>) repositorioUsuario.findAll();
	}
	
	@PostMapping
	public void insert(@RequestBody Usuarios usuario){
		repositorioUsuario.save(usuario);
	}
	
	@PutMapping
	public void modificar(@RequestBody Usuarios usuario){
		repositorioUsuario.save(usuario);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		repositorioUsuario.deleteById(id);
	}
	
}

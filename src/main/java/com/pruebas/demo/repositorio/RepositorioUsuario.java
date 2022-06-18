package com.pruebas.demo.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pruebas.demo.modelos.Usuarios;

@Repository
public interface RepositorioUsuario extends CrudRepository<Usuarios, Long> {

}

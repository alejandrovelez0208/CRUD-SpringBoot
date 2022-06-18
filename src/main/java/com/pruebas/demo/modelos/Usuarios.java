package com.pruebas.demo.modelos;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String usuario;
	
	@Column
	private String clave;
	
	@Column
	private String nombre;
	
	
}

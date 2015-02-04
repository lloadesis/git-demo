package org.adesis.prueba01.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Reservation {
	
	/* Haría falta Bean Validation al ser un objeto que se importa y se gestiona
	desde una librería Java?*/
	private int id;
	
	@NotNull(message="El nombre es obligatorio.")
	@NotEmpty(message="El nombre no puede estar vacio.")
	private String name;
	
	@NotNull(message="Es obligatorio indicar el numero de personas.")
	@NotEmpty(message="El numero de personas no puede estar vacio.")
	@Length(min=1, max=15, message="El numero de personas debe ser entre 1 y 15.")
	private int people;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}	

}
/**
 * 
 */
package com.knowshare.entities.academia;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Representa las carreras que un estudiante puede estar cursando.
 * @author miguel
 *
 */
@Document(collection = "carrera")
public class Carrera {
	
	@Id
	private String nombre;
	
	private String facultad;
	
	@DBRef(lazy = true)
	private List<Carrera> carrerasAfines;
	
	private List<String> enfasis;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Carrera setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the facultad
	 */
	public String getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public Carrera setFacultad(String facultad) {
		this.facultad = facultad;
		return this;
	}

	/**
	 * @return the carrerasAfines
	 */
	public List<Carrera> getCarrerasAfines() {
		return carrerasAfines;
	}

	/**
	 * @param carrerasAfines the carrerasAfines to set
	 */
	public Carrera setCarrerasAfines(List<Carrera> carrerasAfines) {
		this.carrerasAfines = carrerasAfines;
		return this;
	}

	/**
	 * @return the enfasis
	 */
	public List<String> getEnfasis() {
		return enfasis;
	}

	/**
	 * @param enfasis the enfasis to set
	 */
	public Carrera setEnfasis(List<String> enfasis) {
		this.enfasis = enfasis;
		return this;
	}
}

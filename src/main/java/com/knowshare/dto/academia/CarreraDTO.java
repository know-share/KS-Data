/**
 * 
 */
package com.knowshare.dto.academia;

import java.io.Serializable;
import java.util.List;

/**
 * @author miguel
 *
 */
public class CarreraDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private String facultad;
	
	private List<String> carrerasAfines;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public CarreraDTO setNombre(String nombre) {
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
	public CarreraDTO setFacultad(String facultad) {
		this.facultad = facultad;
		return this;
	}

	/**
	 * @return the carrerasAfines
	 */
	public List<String> getCarrerasAfines() {
		return carrerasAfines;
	}

	/**
	 * @param carrerasAfines the carrerasAfines to set
	 */
	public CarreraDTO setCarrerasAfines(List<String> carrerasAfines) {
		this.carrerasAfines = carrerasAfines;
		return this;
	}
}

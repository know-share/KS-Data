/**
 * 
 */
package com.knowshare.dto.academia;

import java.io.Serializable;
import java.util.List;

import com.knowshare.entities.academia.Carrera;

/**
 * Clase que es mapeada de la entidad {@link Carrera} para
 * enviar del servidor al cliente.
 * @author Miguel Montañez
 *
 */
public class CarreraDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String id;

	private String nombre;
	
	private String facultad;
	
	private List<String> carrerasAfines;
	
	private List<String> enfasis;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public CarreraDTO setId(String id) {
		this.id = id;
		return this;
	}

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

	/**
	 * @return the enfasis
	 */
	public List<String> getEnfasis() {
		return enfasis;
	}

	/**
	 * @param enfasis the enfasis to set
	 */
	public  CarreraDTO  setEnfasis(List<String> enfasis) {
		this.enfasis = enfasis;
		return this;
	}
	
	
}

/**
 * 
 */
package com.knowshare.entities.perfilusuario;

import java.io.Serializable;

/**
 * Ya que cada carrera cuenta con diversos enfasis, este
 * documento representa dichos enfasis.
 * @author miguel
 *
 */
public class Enfasis implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private String carrera;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public Enfasis setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public Enfasis setCarrera(String carrera) {
		this.carrera = carrera;
		return this;
	}
}

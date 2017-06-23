/**
 * 
 */
package com.knowshare.entities.academia;

import java.io.Serializable;

/**
 * Ya que cada carrera cuenta con diversos enfasis, este
 * documento representa dichos enfasis.
 * @author miguel
 *
 */
public class AreaConocimiento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	
	private Double porcentaje;
	
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
	public AreaConocimiento setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}

	/**
	 * @return the porcentaje
	 */
	public Double getPorcentaje() {
		return porcentaje;
	}

	/**
	 * @param porcentaje the porcentaje to set
	 */
	public AreaConocimiento setPorcentaje(Double porcentaje) {
		this.porcentaje = porcentaje;
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
	public AreaConocimiento setCarrera(String carrera) {
		this.carrera = carrera;
		return this;
	}
}
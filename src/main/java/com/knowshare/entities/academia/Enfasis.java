/**
 * 
 */
package com.knowshare.entities.academia;

/**
 * Ya que cada carrera cuenta con diversos enfasis, este
 * documento representa dichos enfasis.
 * @author miguel
 *
 */
public class Enfasis {
	
	private String nombre;

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
}
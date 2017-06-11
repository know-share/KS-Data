/**
 * 
 */
package com.knowshare.entities.academia;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Ya que cada carrera cuenta con diversos enfasis, este
 * documento representa dichos enfasis.
 * @author miguel
 *
 */
@Document(collection = "enfasis")
public class Enfasis {
	
	@Id
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
